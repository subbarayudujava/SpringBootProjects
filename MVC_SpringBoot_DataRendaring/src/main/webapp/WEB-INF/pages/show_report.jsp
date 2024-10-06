<%@ page isELIgnored="false" import ="java.util.*"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1> Model attributes data is </h1>

 <b> favcolore are ::</b><br>
 <c:forEach var	="color",items="${favColore}">
 ${color},
</c:forEach>
<br>
<b> nickNames are  ::</b><br>
 <c:forEach var	="names",items="${nickNames}">
 ${names},
</c:forEach>
 <br>
<b> phoneNumbers are::</b><br>
 <c:forEach var	="ph",items="${phoneNumbers}">
 ${ph},
</c:forEach>
<br>
<b> idDeatails::</b><br>
 <c:forEach var	="id",items="${IdDetails}">
 ${id.key},${id.value}
</c:forEach>



 