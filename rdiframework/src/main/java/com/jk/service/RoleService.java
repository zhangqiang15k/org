package com.jk.service;

import java.util.List;

import com.jk.model.TbRole;

public interface RoleService {

	/**
	 * <pre>roleList(角色列表查询)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月17日 上午10:59:53    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月17日 上午10:59:53    
	 * 修改备注： 
	 * @param tbRole
	 * @return</pre>
	 */
	public List<TbRole> roleList(TbRole tbRole);

	/**
	 * <pre>saveRole(添加角色信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月17日 上午11:48:58    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月17日 上午11:48:58    
	 * 修改备注： 
	 * @param tbRole</pre>
	 */
	public void saveRole(TbRole tbRole);

	/**
	 * <pre>deleteIds(批量删除角色信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月17日 下午2:57:38    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月17日 下午2:57:38    
	 * 修改备注： 
	 * @param ids</pre>
	 */
	public void deleteIds(String ids);

	/**
	 * <pre>selectTbRole(通过id查询角色对象信息)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月17日 下午3:23:44    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月17日 下午3:23:44    
	 * 修改备注： 
	 * @param tbRole
	 * @return</pre>
	 */
	public TbRole selectTbRole(TbRole tbRole);
}
