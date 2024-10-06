
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color: blue; text-align: center">Student Register form</h1>


<frm:form action="register" method="post" modelAttribute="stud">
	<table border="0" bgcolor="cyan" align="center">

		<tr>
			<td>Student id::</td>
			<td><frm:input path="sno"/></td>
		</tr>
		<tr>
			<td>Student name::</td>
			<td><frm:input path="sname"/></td>
		</tr>
		<tr>
			<td>Student Addrace::</td>
			<td><frm:input path="sadd"/></td>
		</tr>
		<tr>
			<td>Student Avarage::</td>
			<td><frm:input path="avg"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="register"></td>
			<td><input type="reset" value="cancel"></td>
		</tr>
	</table>
</frm:form>


