<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %> 
<c:choose>

<c:when test="${empty lEmp}">
<h1 style="color:red;text-align:center">Employee report </h1>
<h2 style="color:red;text-align:center">${msg}</h2>
<table border="1" align="center" bgcolor="cyan">
<tr style="color:red"><th>empno</th><th>ename</th><th>job</th><th>salary</th><th>department</th></tr>
<c:forEach var="emp" items="${lEmp}">
<tr style="color:blue">
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.salary}</td>
<td>${emp.department}</td>



</tr>

</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Employee not found</h1>
</c:otherwise>
</c:choose>
<center>
<a href="emp_add">addEmployee</a>&nbsp;&nbsp;&nbsp;
<a href="/get">home</a>
</center>