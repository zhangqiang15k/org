<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快速信息化系统开发框架</title>
<jsp:include page="inc.jsp"></jsp:include>
</head>
<body>
<div id="index_layout" class="easyui-layout" data-options="fit:true">   
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>   
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>   
    <div data-options="region:'west',title:'导航菜单',split:true" style="width:200px;">
    	<div id="index_accordion" class="easyui-accordion" data-options="fit:true">   
		    <div title="权限管理" data-options="" style="overflow:auto;padding:10px;">   
		        <ul id="index_tree"></ul>  
		    </div>   
		    <div title="系统配置" data-options="" style="padding:10px;">   
		        content2    
		    </div>   
		    <div title="测试模块">   
		        content3    
		    </div>   
		</div>  
    </div>   
    <div id="index_div" data-options="region:'center'" style="padding: 3px;">
    	<div id="index_tabs" class="easyui-tabs" data-options="fit:true">   
		    <div title="欢迎使用" style="padding:20px;">   
		        <center><h1>欢迎来到神奇的easyui世界</h1></center>    
		    </div>     
		</div>  
    </div>   
</div>  

<jsp:include page="dialogAll.jsp"></jsp:include>

<script type="text/javascript">
	$(function() {
		//关闭员工管理添加窗口
		$("#employee_employeeList_dialog").dialog('close');
		$('#index_tree').tree({    
		    url:'tree_data1.json',
		    onClick: function(node){
				if (node.url) {
					var url = '${pageContext.request.contextPath}' + node.url;
    				addTab({
    					title:node.text,
    					iconCls:node.iconCls,
    					closable:true,
    					content:'<iframe src="' + url + '" frameBorder="0" style="border:0;width:100%;height:99%;"></iframe>'
    				});
				}
			}
		});  
	})
	
	function addTab(opts) {
		var t = $("#index_tabs").tabs('exists', opts.title);
		if (t) {
			$("#index_tabs").tabs('select', opts.title);
		} else {
			$("#index_tabs").tabs('add', opts);
		}
	}
	
</script>
</body>
</html>