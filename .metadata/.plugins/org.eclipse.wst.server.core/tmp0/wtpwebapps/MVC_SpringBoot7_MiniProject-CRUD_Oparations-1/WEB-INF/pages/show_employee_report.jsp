<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<elements>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1 style="color: red; text-align: center">Employees Report</h1>
<c:choose>
	<c:when test="${!empty empsList}">
		<table>
			<thead>
				<tr style="color: red">
					<th>empno</th>
					<th>ename</th>
					<th>job</th>
					<th>sal</th>
					<th>deptno</th>
					<th>operation</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${empList}">

					<tr style="color: blue">

						<td>$(emp.empno )</td>

						<td>$(emp.ename }</td>

						<td>$(emp.job)</td>

						<td>$(emp.sal)</td>

						<td>$(emp.deptno }</td>
						<td><a href="emp_Edite?no=$(emp.empno)"><img
								src="images/edite.png" width="30px" height="30px"></a> <a
							href="emp_Delete?no=$(emp.empno)" onclick="confim(do you want delete the record)"><img
								src="images/Delete.png" width="30px" height="30px"></a></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>

	</c:when>

	<c:otherwise>

		<h1 style="color: red; text-align: center">Employees Not found</h1>

	</c:otherwise>
	<h1 style="color: red; text-align: center">${result}</h1>
</c:choose>

<center>
	<a href="emp_add"> <img src="images/Add.png" width="40px"
		height="40px">Add Employee
	</a> <a href="./"> <img src="images/Home.png" width="40px"
		height="40px">Home
	</a>
</center>
</elements>