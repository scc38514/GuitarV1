<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>查询页面</title>
</head>
<body>

<h2>guitars查询</h2>
请输入以下内容：<br /><br />
<form action="FindGuitars" method="post">
	<label>serialNumber:</label><input type="text" name="serialNumber"  /><br />
	<label>price:&nbsp;&nbsp;&nbsp;</label><input type="text" name="price" /><br />
	<label>builder:&nbsp;&nbsp;</label><input type="text" name="builder" /><br />
	<label>model:&nbsp;&nbsp;&nbsp;</label><input type="text" name="model" /><br />
	<label>type:&nbsp;&nbsp;&nbsp;</label><input type="text" name="type" /><br />
	<label>backWood:&nbsp;</label><input type="text" name="backWood" /><br />
	<label>topWood:&nbsp;&nbsp;</label><input type="text" name="topWood" /><br />
	<div><input type="submit" value="查询" style="width:150px" /></div><br />
</form>
</body>
</html>