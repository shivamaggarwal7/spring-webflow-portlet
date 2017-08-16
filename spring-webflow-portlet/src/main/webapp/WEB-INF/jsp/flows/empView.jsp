<%@ include file="/WEB-INF/jsp/flows/init.jsp" %>

<portlet:actionURL var="createEmpURL">
	<portlet:param name="_eventId" value="addChildView" />
	<portlet:param name="execution" value="${flowExecutionKey}" />
</portlet:actionURL>	

<form:form id="empForm" modelAttribute="emp" action="${createEmpURL}" method="POST" cssClass="form-horizontal">
	
    <form:input type="hidden" id="empId" path="empId" />

    <div class="control-group">
        <label class="control-label" for="empName">Employee Name</label>
        <div class="controls">
            <form:input type="text" id="empName" path="empName" />
             <form:errors path="empName" cssClass="text-error" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="grade">Grade</label>
        <div class="controls">
            <form:input type="text" id="grade" path="grade" />
            <form:errors path="grade" cssClass="text-error" />
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
             <c:choose> 
			  <c:when test="${emp.empId == 0}">
                <input id="validateNewEmployeeButton" class="btn btn-primary" type="submit" value="Create"/>
			 </c:when>
            <c:otherwise>
                <input id="validateUpdateContactButton" class="btn btn-primary" type="submit" value="Update"/>
            </c:otherwise>    
            </c:choose>
            
            <%-- <a href="${listContactsURL}" class="btn">Cancel</a> --%>
        </div>
    </div>
  </form:form>