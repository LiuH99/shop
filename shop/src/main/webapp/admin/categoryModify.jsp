<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%-- <%@include file="isAdmin.jsp" %> --%>
<!DOCTYPE html>
<html lang="zh-cn">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<meta name="renderer" content="webkit">
		<title></title>
		<link rel="stylesheet" href="css/pintuer.css">
		<link rel="stylesheet" href="css/admin.css">
		<script src="js/jquery.js"></script>
		<script src="js/pintuer.js"></script>
		<title></title>
	</head>
	<body>
		<div class="panel admin-panel margin-top" id="add">
		  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 修改品牌</strong></div>
		  <div class="body-content">
		    <form method="post" class="form-x" action="categoryModify">    
		      <div class="form-group">
		        <div class="label">
		        <input type="hidden" name="cid" value="${c.cid}"/>
		          <label>品牌名称：</label>
		        </div>
		        <div class="field">
		          <input type="text" class="input w50" value="${c.cname}" name="cname" data-validate="required:请输入名称" />
		          <div class="tips"></div>
		        </div>
		      </div>
			 
			      <div class="form-group">
		        <div class="label">
		          <label></label>
		        </div>
		        <div class="field">
		          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
		        </div>
		      </div>
		    </form>
		  </div>
		</div>
		
	</body>
</html>
