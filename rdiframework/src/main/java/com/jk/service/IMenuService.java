package com.jk.service;

import java.util.List;

import com.jk.model.TMenu;

public interface IMenuService {

	/**
	 * <pre>menuList(菜单列表查询)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:00:23    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:00:23    
	 * 修改备注： 
	 * @param menu
	 * @return</pre>
	 */
	public List<TMenu> menuList(TMenu menu);
	
	/**
	 * <pre>insert(添加菜单信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:11:09    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:11:09    
	 * 修改备注： 
	 * @param menu</pre>
	 */
	public void insert(TMenu menu);
	
	/**
	 * <pre>delete(通过id删除菜单信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:15:43    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:15:43    
	 * 修改备注： 
	 * @param id</pre>
	 */
	public void delete(Integer id);
	
	/**
	 * <pre>selectTMenuById(通过id获得一个对象)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:18:41    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:18:41    
	 * 修改备注： 
	 * @param id
	 * @return</pre>
	 */
	public TMenu selectTMenuById(Integer id);
	
	/**
	 * <pre>updateTMenu(修改菜单信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:19:06    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:19:06    
	 * 修改备注： 
	 * @param menu</pre>
	 */
	public void updateTMenu(TMenu menu);
}
