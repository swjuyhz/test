package com.bjtct.oom.mms.service.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bjtct.oom.common.exception.BzException;
import com.bjtct.oom.common.utils.JsonUtils;
import com.bjtct.oom.common.vo.Constans;
import com.bjtct.oom.common.vo.Count;
import com.bjtct.oom.common.vo.Result;
import com.bjtct.oom.mms.domain.menu.MenuEntity;
import com.bjtct.oom.mms.domain.menu.MenuQuery;
import com.bjtct.oom.mms.mapper.menu.MenuMapper;
import com.bjtct.oom.mms.service.privilege.PrivilegeService;
import com.whalin.MemCached.MemCachedClient;

/**
 * menu模块对应的业务实现类
 * 
 * @since 2015-09-17 10:26
 * @author autogen
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	public static Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);
	private static final String MENU_TREE = "MENU_TREE";
	@Autowired
	private MenuMapper menuMapper;
	@Autowired
	private PrivilegeService privilegeService;

	@Autowired
	private MemCachedClient memCacheClient;

	public MenuEntity getMenuByID(String id) {

		return menuMapper.getMenuByID(id);
	}

	public List<MenuEntity> getMenuChildrens(String id) {
		return menuMapper.getMenuChildrens(id);
	}

	 
	public List<MenuEntity> getMenuTree() {
		MenuEntity root = null;
		String rst = (String) memCacheClient.get(MENU_TREE);
		if(null != rst){
			root = JsonUtils.toObjectBean(rst, MenuEntity.class);
			return Collections.singletonList(root);
		}else{
			root = getMenuByID(Constans.ROOT_ID);			 
			buildTree(root);
			memCacheClient.set(MENU_TREE, JsonUtils.toString(root));
			return Collections.singletonList(root);
		}
	 
	}

	private void buildTree(MenuEntity obj) {
		List<MenuEntity> child = this.getMenuChildrens(obj.getId());
		if (child != null && child.size() > 0) {
			obj.setChildren(child);
			obj.setState("close");
			for (MenuEntity o : child) {
				buildTree(o);
			}
		} else {
			obj.setState("open");
		}
	}

	public List<MenuEntity> getPrivilegeMenuTree(String roleid) {
		MenuEntity root = getMenuByID(Constans.ROOT_ID);
		List<MenuEntity> list = new ArrayList<MenuEntity>();
		buildPrivilegeTree(root, roleid);
		list.add(root);
		return list;
	}

	private void buildPrivilegeTree(MenuEntity obj, String roleid) {
		List<MenuEntity> child = this.getMenuChildrens(obj.getId());
		List<String> relatedids = privilegeService.getPrivilegeByRoleID(roleid,"M");
		if (child != null && child.size() > 0) {
			obj.setChildren(child);
			obj.setState("close");
			for (int i = 0; i < child.size(); i++) {
				MenuEntity org = child.get(i);
				if (null != relatedids && relatedids.size() > 0) {
					for (int t = 0; t < relatedids.size(); t++) {
						if (org.getId().equalsIgnoreCase(relatedids.get(t))) {
							org.setChecked("true");
							child.set(i, org);
						}
					}
				} else {
					break;
				}
			}
			for (MenuEntity o : child) {
				buildPrivilegeTree(o, roleid);
			}
		} else {
			obj.setState("open");
		}
	}

	public Result<MenuEntity> getMenuList(MenuQuery query) {

		Result<MenuEntity> result = new Result<MenuEntity>(menuMapper.getMenuCount(query),
				menuMapper.getMenuList(query));
		return result;
	}

	public List<MenuEntity> getMenuAll(MenuQuery query) {
		return menuMapper.getMenuAll(query);
	}

	public Count getMenuCount(MenuQuery query) {
		Count count = new Count(menuMapper.getMenuCount(query));
		return count;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { BzException.class })
	public void saveMenu(MenuEntity entity) throws BzException {
		try {
			menuMapper.saveMenu(entity);
			memCacheClient.delete(MENU_TREE);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new BzException("保存出现错误，请重新操作或联系管理员检查错误！");
		}

	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { BzException.class })
	public void updateMenu(MenuEntity entity) throws BzException {
		try {
			menuMapper.updateMenu(entity);
			memCacheClient.delete(MENU_TREE);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new BzException("更新出现错误，请重新操作或联系管理员检查错误！");
		}
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { BzException.class })
	public void deleteMenu(String[] id) throws BzException {
		try {
			menuMapper.deleteMenu(id);
			memCacheClient.delete(MENU_TREE);
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new BzException("删除出现错误，请重新操作或联系管理员检查错误！");
		}
	}
}
