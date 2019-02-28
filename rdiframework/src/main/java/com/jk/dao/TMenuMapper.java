package com.jk.dao;

import java.util.List;

import com.jk.model.TMenu;

public interface TMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    TMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);
    
    /**
     * <pre>menuList(菜单列表查询)   
     * 创建人：杨志超 yangzhichao150@126.com    
     * 创建时间：2018年12月14日 下午2:56:37    
     * 修改人：杨志超 yangzhichao150@126.com     
     * 修改时间：2018年12月14日 下午2:56:37    
     * 修改备注： 
     * @param menu
     * @return</pre>
     */
    List<TMenu> menuList(TMenu menu);
}