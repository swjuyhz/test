package com.bjtct.oom.mms.domain.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bjtct.oom.common.utils.JsonUtils;

/**
 * menu模块对应的实体类
 * 
 * @since 2015-09-17 10:26
 * @author autogen
 */

public class MenuEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7944948580050463435L;
	// 主键
	private String id;
	// 上级菜单
	private String pid;
	private MenuEntity parent;
	// 功能名称
	private String text;
	private String menuname;
	// 菜单编号
	private String menucode;
	// 菜单类型
	private String menutype;
	// 关键字
	private String keyword;
	// 功能地址
	private String url;
	// 是否外网连接
	private String sysmenu;
	// 功能状态
	private String status;
	// 功能级别
	private int menulevel;

	private String checked;
	// 创建时间

	private Date createtime;
	// 最后更新

	private Date lastmodify;

	private String state;
	private List<MenuEntity> children = new ArrayList<MenuEntity>();

 
	public String getId() {
		return id;
	}


	public String getText() {
		return this.menuname;
	}


	public void setText(String text) {
		this.text = text;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPid() {
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public MenuEntity getParent() {
		return parent;
	}


	public void setParent(MenuEntity parent) {
		this.parent = parent;
	}


	public String getMenuname() {
		return menuname;
	}


	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}


	public String getMenucode() {
		return menucode;
	}


	public void setMenucode(String menucode) {
		this.menucode = menucode;
	}


	public String getMenutype() {
		return menutype;
	}


	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getSysmenu() {
		return sysmenu;
	}


	public void setSysmenu(String sysmenu) {
		this.sysmenu = sysmenu;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getMenulevel() {
		return menulevel;
	}


	public void setMenulevel(int menulevel) {
		this.menulevel = menulevel;
	}


	public String getChecked() {
		return checked;
	}


	public void setChecked(String checked) {
		this.checked = checked;
	}


	public Date getCreatetime() {
		return createtime;
	}


	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	public Date getLastmodify() {
		return lastmodify;
	}


	public void setLastmodify(Date lastmodify) {
		this.lastmodify = lastmodify;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public List<MenuEntity> getChildren() {
		return children;
	}


	public void setChildren(List<MenuEntity> children) {
		this.children = children;
	}


	@Override
	public String toString() {
		return JsonUtils.toString(this);
	}
}
