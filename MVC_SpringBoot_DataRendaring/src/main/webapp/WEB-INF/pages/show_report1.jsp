<%@ page isELIgnored="false" import="java.util.*"%>

<c:if test="${!empty empinfo}" >
<b> Emp  Information ::${empinfo.eid},${empinfo.ename},${empinfo.salary},${empinfo.vaccinated}</b>
</c:if>

