<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%
	request.getAttribute("user_id");
	request.getAttribute("user_code");
	request.getAttribute("user_name");
	request.getAttribute("user_password");
%>

<%
	out.println("user_id");
	out.println("user_code");
	out.println("user_name");
	out.println("user_password");
%>

<body>
	<div id="top" align="center">
		<form class="form-inline"
			action="${pageContext.request.contextPath }/customer/list.action"
			method="get">
			<h3>兴业银行图书馆管理系统</h3>

			<div class="">
				用户Id：<input type="text" id="user_id" align="middle" name="用户名" value="${users.user_id }"><br>
				用户code：<input type="text" id="user_code" align="middle" name="用户名" value="${users.user_code }"><br>
				用户名：<input type="text" id="user_name" align="middle" name="用户名" value="${users.user_name }"><br>
				密码：<input type="password" id="user_password" align="middle" name="密码" value="${users.user_password }"><br>
				<input type="submit" name="登录"><br>
			</div>
		</form>
	</div>

<%
	if(request.getParameter("user_id") != null && request.getParameter("user_password") != null){
		String Name = request.getParameter("user_id");
		String Password = request.getParameter("user_password");
		
		if(Name.equals("Tom") && Password.equals("123")){
			session.setAttribute("Login", "OK");
			response.sendRedirect("list.jsp");
		}else{
			
		}
	}
%>
</body>
</html>