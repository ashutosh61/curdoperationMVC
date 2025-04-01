<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<%@ page isELIgnored = "false" %>

<h1 style="color:red;text-align:center"> add employee</h1>
<c:form modelAttribute="emp">
<table align="center" bgcolor="yellow">
<tr>
<td>Employee name</td>
<td><c:input path="ename"/></td>
</tr>
<tr>
<td>Job</td>
<td><c:input path="job"/></td>
</tr>
<tr>
<td>Salary</td>
<td><c:input path="salary"/></td>
</tr>
<tr>
<td>department</td>
<td><c:input path="department"/></td>
</tr>

<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</c:form>