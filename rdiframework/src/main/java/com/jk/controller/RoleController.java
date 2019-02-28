package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.model.Result;
import com.jk.model.TbRole;
import com.jk.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/roleList")
	@ResponseBody
	public List<TbRole> roleList(TbRole tbRole) {
		return roleService.roleList(tbRole);
	}
	
	@RequestMapping("/saveRole")
	@ResponseBody
	public Result saveRole(TbRole tbRole) {
		try {
			roleService.saveRole(tbRole);
			return new Result(true, "添加成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败！");
		}
	}
	
	/**
	 * <pre>deleteIds(批量删除)   
	 * 创建人：杨志超 yangzhichao150@126.com    
	 * 创建时间：2018年12月17日 下午3:20:59    
	 * 修改人：杨志超 yangzhichao150@126.com     
	 * 修改时间：2018年12月17日 下午3:20:59    
	 * 修改备注： 
	 * @param ids
	 * @return</pre>
	 */
	@RequestMapping("/deleteIds")
	@ResponseBody
	public Result deleteIds(String ids) {
		try {
			roleService.deleteIds(ids);
			return new Result(true, "删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败！");
		}
	}
	
	@RequestMapping("/selectTbRole")
	@ResponseBody
	public TbRole selectTbRole(TbRole tbRole) {
		return roleService.selectTbRole(tbRole);
	}
}
