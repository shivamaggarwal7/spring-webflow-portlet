<%@ include file="/WEB-INF/jsp/flows/init.jsp" %>

<portlet:actionURL var="createChildURL">
	<portlet:param name="_eventId" value="bookAppnt" />
	<portlet:param name="execution" value="${flowExecutionKey}" />
</portlet:actionURL>	

<form:form id="childForm" modelAttribute="child" action="${createChildURL}" method="POST" cssClass="form-horizontal">
	
    <form:input type="hidden" id="childId" path="childId" />

    <div class="control-group">
        <label class="control-label" for="empName">Name</label>
        <div class="controls">
            <form:input type="text" id="name" path="name" />
             <form:errors path="name" cssClass="text-error" />
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="grade">Age</label>
        <div class="controls">
            <form:input type="text" id="age" path="age" />
            <form:errors path="age" cssClass="text-error" />
        </div>
    </div>
        <div class="control-group">
        <label class="control-label" for="grade">Gender</label>
        <div class="controls">
             <form:radiobutton  id="gender" path="gender" value="Male" label="Male"/>
             <form:radiobutton path="gender" id="gender" value="Female" label="Female"/>             
            <form:errors path="gender" cssClass="text-error" />
        </div>
    </div>
        
    
    <div class="control-group">
        <div class="controls">
             <c:choose> 
			  <c:when test="${child.childId == 0}">
                <input id="validateNewEmployeeButton" class="btn btn-primary" type="submit" value="Create"/>
			 </c:when>
            <c:otherwise>
                <input id="validateUpdateContactButton" class="btn btn-primary" type="submit" value="Update"/>
            </c:otherwise>    
            </c:choose>
           </div>
    </div>
  </form:form>