<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<h2>Spring Security Web App</h2>

<br>

<p>Header name: ${_csrf.headerName}</p>
<p>Parameter name: ${_csrf.parameterName}</p>
<p>CSRF Token: ${_csrf.token}</p>

