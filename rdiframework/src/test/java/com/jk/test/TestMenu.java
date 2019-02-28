package com.jk.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jk.model.TMenu;
import com.jk.service.IMenuService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMenu {

	@Autowired
	private IMenuService menuService;
	
	@Test
	public void menuList() {
		List<TMenu> menuList = menuService.menuList(new TMenu());
		System.out.println(menuList);
	}
	
	@Test
	public void insert() {
		TMenu menu = new TMenu();
		menu.setName("参数管理");
		menu.setType("0");
		menu.setCreatedatetime(new Date());
		menu.setModifydatetime(new Date());
		menuService.insert(menu);
		System.out.println("添加成功！");
	}
	
	@Test
	public void delete() {
		menuService.delete(9);
		System.out.println("删除成功！");
	}
	
	
}
