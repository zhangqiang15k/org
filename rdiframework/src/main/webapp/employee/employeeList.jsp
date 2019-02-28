<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理</title>
<jsp:include page="../inc.jsp"></jsp:include>
</head>
<body>
	<div id="employee_employeeList_layout" class="easyui-layout" data-options="fit:true">   
	    <div data-options="region:'west',title:'组织机构',split:true,iconCls:'icon-sitemap-color'" style="width:200px;">
	    	<ul id="employee_employeeList_tree"></ul> 
	    </div>   
	    <div data-options="region:'center',title:'员工管理',iconCls:'icon-group'" style="padding:1px;">
	    	<table id="employee_employeeList_datagrid"></table>  
	    </div>   
	</div>  
	
	
	<div id="employee_employeeList_toolbar">
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true">刷新</a>
		<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-add',plain:true" onclick="addEmployee();">添加</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-edit',plain:true">修改</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-delete',plain:true">删除</a>
		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">导出</a>
	</div>
	
	<script type="text/javascript">
		$(function() {
			$('#employee_employeeList_tree').tree({    
			    url:'../tree_data1.json'   
			});  
			
			$('#employee_employeeList_datagrid').datagrid({    
			    url:'datagrid_data1.json',    
			    title:'员工（职员）列表',
			    toolbar: '#employee_employeeList_toolbar',
			    columns:[[    
			        {field:'productid',title:'productid',width:100},    
			        {field:'productname',title:'productname',width:100},    
			        {field:'unitcost',title:'unitcost',width:100,align:'right'}    
			    ]]    
			});  
		})
		
		function addEmployee() {
			parent.$("#employee_employeeList_dialog").show().dialog('open');
		}
		
	</script>
</body>
</html>