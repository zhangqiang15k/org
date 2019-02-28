package com.jk.dao;

import java.util.List;

import com.jk.model.TbRole;

public interface TbRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
    
    /**
     * <pre>roleList(角色列表查询)   
     * 创建人：杨志超 yangzhichao150@126.com    
     * 创建时间：2018年12月17日 上午10:51:03    
     * 修改人：杨志超 yangzhichao150@126.com     
     * 修改时间：2018年12月17日 上午10:51:03    
     * 修改备注： 
     * @param tbRole
     * @return</pre>
     */
    List<TbRole> roleList(TbRole tbRole);

    /**
     * <pre>deleteIds(批量删除角色信息)   
     * 创建人：杨志超 yangzhichao150@126.com    
     * 创建时间：2018年12月17日 下午2:59:32    
     * 修改人：杨志超 yangzhichao150@126.com     
     * 修改时间：2018年12月17日 下午2:59:32    
     * 修改备注： 
     * @param ids</pre>
     */
	void deleteIds(List<Integer> ids);
}