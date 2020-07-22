<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@include file="isAdmin.jsp" %>
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
		  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加产品</strong></div>
		  <div class="body-content">
		    <form method="post" class="form-x" action="productModify" enctype="multipart/form-data">    
		      <div class="form-group">
		        <div class="label">
		          <label>产品名称：</label>
		        </div>
		        <div class="field">
		          <input type="text" class="input w50" value="${p.pname}" name="pname" data-validate="required:请输入产品名称" />
		          <div class="tips"></div>
		        </div>
		      </div>
			  
			  <div class="form-group">
			    <div class="label">
			      <label>产品价格：</label>
			    </div>
			    <div class="field">
			      <input type="text" class="input w50" value="${p.pprice}" name="pprice" data-validate="required:请输入产品价格" />
			      <div class="tips"></div>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="label">
			      <label>产品品牌：</label>
			    </div>
			    <select name="pbid">
			    <c:forEach items="${brandList}" var="b">
					<option value="${b.bid}" <c:if test="${p.pbid==b.bid}"> selected="selected"</c:if>>${b.bname}</option>
			    </c:forEach>
				</select>
			  </div>
			  <div class="form-group">
			    <div class="label">
			      <label>产品分类：</label>
			    </div>
			    <select name="pate">
			    <c:forEach items="${categoryList}" var="c">
			  			<option value="${c.cid}" <c:if test="${p.pate==c.cid}"> selected="selected"</c:if>>${c.cname}</option>
						
			  	</c:forEach>
			  	</select>
			  </div>
		       <div class="form-group">
		        <div class="label">
		          <label>图片：</label>
		        </div>
		        <div class="field">
		        <input type="hidden" name="ppic" value="${p.ppic}"/>
<!-- 		          <input type="text" id="url1" name="ppic" class="input tips" style="width:25%; float:left;"  value="" data-toggle="hover" data-place="right" data-image="" data-validate="required:请输入产品图片"/> -->
		          <input type="file" name="file" class="button bg-blue margin-left" id="image1" value=""  style="float:left;">
		          <img src="../uploads/${p.ppic}" />
		        </div>
		      </div>
		      <div class="form-group">
		        <div class="label">
		          <label>产品描述：</label>
		        </div>
		        <div class="field">
		          <textarea type="text" class="input" name="pcontent" style="height:120px;" value="" >${p.pcontent}</textarea>
		          <div class="tips"></div>
		        </div>
		      </div>
		       <div class="form-group">
		        <div class="label">
		          <label></label>
		        </div>
		        <input type="hidden" name="pid" value="${p.pid}"/>
		        <div class="field">
		          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
		        </div>
		      </div>
		    </form>
		  </div>
		</div>
		
	</body>
</html>
