package com.jk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.model.TMenu;
import com.jk.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private IMenuService menuService;
	
	@RequestMapping("/menuList")
	@ResponseBody
	public List<TMenu> menuList(TMenu menu, HttpServletRequest request) {
		List<TMenu> menuList = menuService.menuList(menu);
		return menuList;
	}
	
	/**
	 * <pre>toEmployeeList(第一种跳转页面方式，不改变请求路径)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月14日 下午3:31:46    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月14日 下午3:31:46    
	 * 修改备注： 
	 * @return</pre>
	 */
	@RequestMapping("/toEmployeeList")
	public String toEmployeeList() {
		return "employee/employeeList";
	}
	
	@RequestMapping("/toEmployee")
	public String toEmployee() {
		return "redirect:/employee/employeeList.jsp";
	}
}
