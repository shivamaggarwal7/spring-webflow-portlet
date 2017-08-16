<%@ include file="/WEB-INF/jsp/flows/init.jsp" %>


<h2>Final Booking</h2>
<form:form id="appntForm" modelAttribute="appnt" method="POST" cssClass="form-horizontal">
	
    <form:input type="hidden" id="appointmentId" path="appointmentId" />

    <div class="control-group">
        <label class="control-label" for="empName">Emp Name</label>
        <div class="controls">
             <form:input type="text" id="empName" path="empName" />
        </div>
    </div>
    
    <div class="control-group">
        <label class="control-label" for="empName">Child Name</label>
        <div class="controls">
             <form:input type="text" id="childName" path="childName" />
        </div>
    </div>
    
    <div class="control-group">
        <label class="control-label" for="empName">Hospital Name</label>
        <div class="controls">
             <form:input type="text" id="hospName" path="hospName" />
        </div>
    </div>
    
    <div class="control-group">
        <label class="control-label" for="empName">Date</label>
        <div class="controls">
             <form:input path="date" />
        </div>
    </div>        
  </form:form>