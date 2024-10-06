<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color: red; text-align: center">Register Employee</h1>

<frm:form modelAttribute="emp" />

<table align="center" bgcolor="cyan">

	<tr>
		<td>Employee name</td>
		<td><frm:input path="ename" /></td>
	</tr>
	<tr>
		<td>Employee desg</td>
		<td><frm:input path="job" /></td>
	</tr>
	<tr>
		<td>Employee salary</td>
		<td><frm:input path="sal" /></td>
	</tr>
	<tr>
		<td>Employee DeptNo</td>
		<td><frm:input path="deptno" /></td>
	</tr>
	<tr>
		<td><frm:input type="Submit" value="Submit" /></td>
		<td><frm:input type="reset" value="cansel" /></td>
	</tr>
</table>
</frm:form>
