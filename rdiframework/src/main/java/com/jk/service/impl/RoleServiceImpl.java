package com.jk.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.TbRoleMapper;
import com.jk.model.TbRole;
import com.jk.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private TbRoleMapper roleMapper;

	public List<TbRole> roleList(TbRole tbRole) {
		return roleMapper.roleList(tbRole);
	}

	public void saveRole(TbRole tbRole) {
		roleMapper.insert(tbRole);
	}

	public void deleteIds(String ids) {
		String[] split = ids.split(",");
		List<Integer> list = new ArrayList<Integer>();
		//Integer.valueOf(String)将字符串转换为数值类型，.trim()方法是去掉数值两端的空格
		for (int i = 0; i < split.length; i++) {
			if (split[i].trim() != null && !"".equals(split[i].trim())) {
				list.add(Integer.valueOf(split[i].trim()));
			}
		}
		roleMapper.deleteIds(list);
	}

	public TbRole selectTbRole(TbRole tbRole) {
		return roleMapper.selectByPrimaryKey(tbRole.getId());
	}

}
