<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 管理员列表</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='adminAdd.jsp'"><span class="icon-plus-square-o"></span> 添加管理员</button>
  </div>
  <table class="table table-hover text-center">
    <tr>
      <th width="10%">ID</th>
      <th width="20%">管理员名称</th>
      <th width="15%">密码</th>
      <th width="15%">操作</th>
    </tr>
   <c:forEach items="${adminList}" var="a">
    <tr>
      <td>${a.aid}</td>     
      <td>${a.aname}</td>     
      <td>${a.apwd}</td>
      <td><div class="button-group">
      <a class="button border-main" href="adminModify?aid=${a.aid}"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="adminDelete?aid=${a.aid}" onclick="return confirm('是否真的要删除?');"><span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
   </c:forEach>
       <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
    
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script>
</body></html>