<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
  <link href="css/metro-bootstrap.css" rel="stylesheet" type="text/css">
  <head>
    <base href="<%=basePath%>">
 
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  
  <body class="metro">
  <div id="top-bar" >
  <a class="emar-place-top-left" name="yiqifa" href="http://www.yiqifa.com" target="_blank" title="一起发首页"><img src="imags/yiqifa.png"/></a>
  <div class="emar-place-top-left180" ><p class="emar-help">帮助中心</p></div>
  
  <div id="navigation">
  	<ul>
  		<li><a>网站主</a></li>
  		<li><a>广告主</a></li>
  		<li><a>管理员</a></li>
  	
  	
  	</ul>
  </div>
  
  
  </div>
  
  
  
  
  
  
  
  
  
  
  
  
  <!-- <table class="bordered">
  <tr>
  </tr>
  <form action = "LoginAction.action" method="post">
  <fieldset>
  <legend>用户信息</legend>
  <pre>
  	用户名：<input type="text" name="name" ><br>  
	密 码：<input type="password" name ="passWord" class="input"><br>  
         <input type="submit" value="提交">  
         <input type="reset" value="重置">  
  </pre>
  </fieldset>
               
  </form>  
  <a href="" />">注册</a>
  
  
  </table> -->

  
    

  </body>
</html>
