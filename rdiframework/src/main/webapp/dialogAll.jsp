<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 员工添加弹框 -->
<div id="employee_employeeList_dialog" class="easyui-dialog" title="新增员工（职员）" style=" width:600px;height:400px;padding:3px; margin-top: 10px;"   
       data-options="iconCls:'icon-vcard-add',buttons:'#dialogAll_buttons',resizable:true,modal:true">   
    <div id="dialogAll_tabs" class="easyui-tabs" data-options="fit:true">   
	    <div title="基本信息" style="padding:3px;">   
	        <form id="dialogAll_form" action="" method="post">
		        <table border="1" style="width: 530px; height: 330px;" cellpadding="0" cellspacing="0">
		        	<tr>
		        		<td>员工姓名：</td>
		        		<td><input id="vv" class="easyui-validatebox" name="employeeName" data-options="required:true" /></td>
		        		<td>编号：</td>
		        		<td><input id="vv" class="easyui-validatebox" name="employeeName" data-options="required:true" /></td>
		        	</tr>
		        	<tr>
		        		<td>性别：</td>
		        		<td>
		        			<select id="sex" class="easyui-combobox" name="sex" style="width:182px;">   
							    <option value="0">男</option>   
							    <option value="1">女</option>    
							</select>  
		        		</td>
		        		<td>组织机构：</td>
		        		<td>
		        			<select id="orgName" class="easyui-combotree" style="width:200px;"   
        					data-options="url:'tree_data2.json',required:true"></select>  
		        		</td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        	<tr>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        		<td></td>
		        	</tr>
		        </table> 
		   </form>  
	    </div>   
	    <div title="工作相关" data-options="" style="overflow:auto;padding:20px;">   
	        tab2    
	    </div>   
	    <div title="家庭相关" data-options="" style="padding:20px;">   
	        tab3    
	    </div>   
	</div>  
</div> 

<div id="dialogAll_buttons">
<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确定</a> 
<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-no'">关闭</a> 
</div>
<!-- 新增角色dialog -->
<div id="role_roleList_dialog" title="新增角色" style="width:600px;height:400px;margin-top: 10px; padding: 3px; display: none;"   
        data-options="resizable:true,modal:true">   
	<form id="role_roleList_form">			
		<table border="1" cellspacing="0" width="520" height="320" cellpadding="10" bordercolor="blue">
			<tr>
				<td>角色编号：</td>
				<td><input type="text" id="code" name="code" style="width: 182px;"></td>
			</tr>
			<tr>
				<td>角色名称：</td>
				<td><input type="text" name="realname" style="width: 182px;"></td>
			</tr>
			<tr>
				<td>角色分类：</td>
				<td>
					<select class="easyui-combobox" panelHeight="auto" id="roletype" name="roletype" style="width:182px">
				        <option value="xtjs">系统角色</option>
				        <option value="ywjs">业务角色</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>有效性：</td>
				<td><input type="checkbox" value="1" name="enabled" checked="checked"></td>
			</tr>
			<tr>
				<td>描述：</td>
				<td>
					<textarea style="width: 382px; height: 80px;" name="description">
					
					</textarea>
				</td>
			</tr>
		</table>
    </form>
</div>  


