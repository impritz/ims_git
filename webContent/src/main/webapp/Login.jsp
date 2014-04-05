<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         
        <html:form action="/login" >
            User Name : <html:text name="LoginForm" property="uName" /> 
 
            Password  : <html:password name="LoginForm" property="pWd" /> 
 
            <html:submit value="Login" />
        </html:form>
    </body>
</html>