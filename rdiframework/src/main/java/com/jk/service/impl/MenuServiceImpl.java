package com.jk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.TMenuMapper;
import com.jk.model.TMenu;
import com.jk.service.IMenuService;

@Service("menuService")
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private TMenuMapper tmenuMapper;
	
	public List<TMenu> menuList(TMenu menu) {
		return tmenuMapper.menuList(menu);
	}

	public void insert(TMenu menu) {
		tmenuMapper.insert(menu);
	}

	public void delete(Integer id) {
		tmenuMapper.deleteByPrimaryKey(id);
	}

	public TMenu selectTMenuById(Integer id) {
		return tmenuMapper.selectByPrimaryKey(id);
	}

	public void updateTMenu(TMenu menu) {
		tmenuMapper.updateByPrimaryKey(menu);
	}

}
