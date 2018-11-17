package com.bjtct.oom.mms.mapper.menu;
import java.util.List;
import com.bjtct.oom.mms.domain.menu.MenuEntity;
import com.bjtct.oom.mms.domain.menu.MenuQuery;
/**
*menu模块对应的数据接口
*@since 2015-09-17 10:26
*@author autogen
*/
public interface MenuMapper{

	/**
	*查询menu详情
	*@param id pk
	*/
	public MenuEntity getMenuByID(String id);
	/**
	 * 查询Menu的子节点
	 * @param  id 主键
	 * @return 子集合
	 */
	public List<MenuEntity> getMenuChildrens(String id );
	/**
	 * 根据条件查询 
	 * @param query 条件对象
	 * @return  集合
	 */
	public List<MenuEntity> getMenuList(MenuQuery query);
		/**
	 * 根据条件查询 
	 * @param query 条件对象
	 * @return  集合
	 */
	public List<MenuEntity> getMenuAll(MenuQuery query);
	/**
	 * 根据条件查询总数
	 * @param query 条件对象
	 * @return 数量
	 */
	public int getMenuCount(MenuQuery query);
	/**
	 * 保存 
	 * @param entity 对象
	 */
	public void saveMenu(MenuEntity entity) ;
	/**
	 * 更新 
	 * @param entity 对象
	 */
	public void updateMenu(MenuEntity entity) ;
	/**
	 * 删除
	 * @param id 
	 * @throws BzException
	 */
	 public void deleteMenu(String[] id) ;
}
