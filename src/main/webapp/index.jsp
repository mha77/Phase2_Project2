<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>
        <p><a href="<s:url action='hello'/>">Hello World</a></p>
        <h3>Willkommen bei Struts</h3>
        
        <s:form action="test"> 
 		<s:textfield name="id" label="Product Id"></s:textfield>  
		<s:textfield name="name" label="Product Name"></s:textfield>  
		<s:textfield name="price" label="Product Price"></s:textfield>  
		<s:submit value="save"></s:submit>  
		</s:form>
    </body>
</html>