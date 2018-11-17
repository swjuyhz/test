package com.bjtct.oom.mms.domain.menu;
import com.bjtct.oom.common.vo.Page;
import com.bjtct.oom.common.utils.JsonUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import java.util.Date;
/**
*menu模块对应的查询类
*@since 2015-09-17 10:26
*@author autogen
*/
@SuppressWarnings("serial")
public class MenuQuery extends Page{

	/** 上级菜单*/	
	private String pid;
	/** 功能名称*/	
	private String menuname;
	/** 菜单编号*/	
	private String menucode;
	/** 菜单类型*/	
	private String menutype;
	/** 关键字*/	
	private String keyword;
	/** 功能地址*/	
	private String url;
	/** 是否外网连接*/	
	private String sysmenu;
	/** 功能状态*/	
	private String status;
	/** 功能级别*/	
	private Integer menulevel;
	/** 创建时间*/	
	@DateTimeFormat(iso=ISO.DATE,pattern="yyyy-MM-dd HH:mm:ss")
	private Date createtime_from;
	@DateTimeFormat(iso=ISO.DATE,pattern="yyyy-MM-dd HH:mm:ss")
	private Date createtime_to;
	/** 最后更新*/	
	@DateTimeFormat(iso=ISO.DATE,pattern="yyyy-MM-dd HH:mm:ss")
	private Date lastmodify_from;
	@DateTimeFormat(iso=ISO.DATE,pattern="yyyy-MM-dd HH:mm:ss")
	private Date lastmodify_to;

	  /**get 上级菜单 */  
	 public String  getPid(){
		return this.pid;
	 }
	 /**set 上级菜单 */  
	 public void setPid(String pid){
		this.pid = pid;
	}
	  /**get 功能名称 */  
	 public String  getMenuname(){
		return this.menuname;
	 }
	 /**set 功能名称 */  
	 public void setMenuname(String menuname){
		this.menuname = menuname;
	}
	  /**get 菜单编号 */  
	 public String  getMenucode(){
		return this.menucode;
	 }
	 /**set 菜单编号 */  
	 public void setMenucode(String menucode){
		this.menucode = menucode;
	}
	  /**get 菜单类型 */  
	 public String  getMenutype(){
		return this.menutype;
	 }
	 /**set 菜单类型 */  
	 public void setMenutype(String menutype){
		this.menutype = menutype;
	}
	  /**get 关键字 */  
	 public String  getKeyword(){
		return this.keyword;
	 }
	 /**set 关键字 */  
	 public void setKeyword(String keyword){
		this.keyword = keyword;
	}
	  /**get 功能地址 */  
	 public String  getUrl(){
		return this.url;
	 }
	 /**set 功能地址 */  
	 public void setUrl(String url){
		this.url = url;
	}
	  /**get 是否外网连接 */  
	 public String  getSysmenu(){
		return this.sysmenu;
	 }
	 /**set 是否外网连接 */  
	 public void setSysmenu(String sysmenu){
		this.sysmenu = sysmenu;
	}
	  /**get 功能状态 */  
	 public String  getStatus(){
		return this.status;
	 }
	 /**set 功能状态 */  
	 public void setStatus(String status){
		this.status = status;
	}
	/**get 功能级别 */  
	 public Integer getMenulevel(){
		return this.menulevel;
	 }
	 /**set 功能级别 */  
	 public void setMenulevel(Integer menulevel){
		this.menulevel = menulevel;
	}
	 /**get 创建时间 begin time*/  
	public Date getCreatetime_from(){
		return createtime_from;
	}
	/**get 创建时间 end time*/  	
	public Date getCreatetime_to(){
		return createtime_to;
	}
	/**set 创建时间 begin time*/  
	public void setCreatetime_from(Date createtime_from){
		this.createtime_from = createtime_from;
	}
	/**set 创建时间 end time*/  	
	public void setCreatetime_to(Date createtime_to){
		this.createtime_to = createtime_to;
	}
	 /**get 最后更新 begin time*/  
	public Date getLastmodify_from(){
		return lastmodify_from;
	}
	/**get 最后更新 end time*/  	
	public Date getLastmodify_to(){
		return lastmodify_to;
	}
	/**set 最后更新 begin time*/  
	public void setLastmodify_from(Date lastmodify_from){
		this.lastmodify_from = lastmodify_from;
	}
	/**set 最后更新 end time*/  	
	public void setLastmodify_to(Date lastmodify_to){
		this.lastmodify_to = lastmodify_to;
	}
		@Override
	public String toString() {
		
		return JsonUtils.toString(this);
	} 
}
