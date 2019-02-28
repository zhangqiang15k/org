<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<jsp:include page="../inc.jsp"></jsp:include>
</head>
<body>
<table id="role_roleList_datagrid" name="role_table"></table>

<div id="role_roleList_toolbar">
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true">刷新</a>
	<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-add',plain:true" onclick="addRole();">添加</a>
	<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-edit',plain:true" onclick="toUpdateRole();">修改</a>
	<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-vcard-delete',plain:true" onclick="deleteIds();">删除</a>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">导出</a>
	角色分类: 
    <select class="easyui-combobox" panelHeight="auto" id="roletype" name="roletype" style="width:100px">
        <option value="xtjs">系统角色</option>
        <option value="ywjs">业务角色</option>
    </select>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="searchRole();">查询</a>
</div>
<script type="text/javascript">
	$(function() {
		$('#role_roleList_datagrid').datagrid({    
		    url:'${pageContext.request.contextPath}/role/roleList.jhtml',   
		    toolbar: '#role_roleList_toolbar',
		    singleSelect: true,
		    columns:[[    
		        {field:'code',title:'角色编号',width:100},    
		        {field:'realname',title:'角色名称',width:100},    
		        {field:'enabled',title:'有效',width:100,align:'right'},
		        {field:'description',title:'描述',width:100,align:'right'},
		        {field:'price',title:'管理',width:100,align:'right'}
		    ]]    
		});  
	})
	
	//查询角色信息
	function searchRole() {
		var roletype = $('#roletype').combobox('getValue');
		$('#role_roleList_datagrid').datagrid('load', {    
			roletype: roletype 
		});  
	}
	
	//添加角色信息
	function addRole() {
		parent.$("#role_roleList_dialog").show().dialog({
			iconCls:'icon-save',
			buttons:[{
				text:'保存',
				iconCls:'icon-ok',
				handler:function(){
					saveRole();
				}
			},{
				text:'关闭',
				iconCls:'icon-no',
				handler:function(){
				
				}
			}]
		});
	}
	
	function saveRole() { 
		$.ajax({
			type: "post",
			url :"${pageContext.request.contextPath }/role/saveRole.jhtml",
			data : parent.$("#role_roleList_form").serialize(),
			dataType: "json",
			success : function(result) {
				if (result.success) {
					parent.$("#role_roleList_dialog").dialog('close');
					$('#role_roleList_datagrid').datagrid('reload');
		         } else {
		        	 alert("2222");
		         }
			},
			error : function() {
				alert("系统错误，请联系管理员！");
			}
			
		})    
	}
	
	//批量删除角色信息
	function deleteIds() {
		var rows =  $("#role_roleList_datagrid").datagrid("getSelections");
		console.info(rows.length);
		if (rows.length == 0) {
			alert("请选择一条删除的信息");
			return false;
		}
		var ids = [];
		for (var i = 0; i < rows.length; i++) {
			ids.push(rows[i].id);
		}
		console.info(ids);
		//删除角色信息
		$.ajax({
			type: "post",
			url: "${pageContext.request.contextPath}/role/deleteIds.jhtml",
			data: {"ids": ids.toString() },
			dataType: "json",
			success: function(result) {
				
			},
			error : function() {
				alert("系统错误，请联系管理员！");
			}
			
		})
		
	}
	
	function toUpdateRole() {
		var rows =  $("#role_roleList_datagrid").datagrid("getSelections");
		console.info(rows.length);
		if (rows.length != 1) {
			alert("请选择一条修改的信息");
			return false;
		}
		if (rows.length == 1) {
			$.ajax({
				type: "post",
				url: "${pageContext.request.contextPath}/role/selectTbRole.jhtml",
				data: {"id": rows[0].id},
				dataType : "json",
				async : false,
				success : function(result) {
					parent.$("#role_roleList_dialog").show().dialog({
						iconCls:'icon-save',
						buttons:[{
							text:'保存',
							iconCls:'icon-ok',
							handler:function(){
								saveRole();
							}
						},{
							text:'关闭',
							iconCls:'icon-no',
							handler:function(){
							
							}
						}]
					});
					
					parent.$("#code").val(result.code);
					parent.$("#roletype").combobox('setValue', result.roletype);
					
				},
				error: function() {
					alert("系统错误，请联系管理员！");
				}
			})
		}
	}
	
	
</script>
</body>
</html>