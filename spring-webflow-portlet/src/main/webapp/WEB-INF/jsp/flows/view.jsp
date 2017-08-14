<%@ include file="/WEB-INF/jsp/flows/init.jsp" %>

<portlet:renderURL var="startFlow">
  <portlet:param name="execution" value="${flowExecutionKey}" />
  <portlet:param name="_eventId" value="main" />
</portlet:renderURL>

<h2>Welcome to Appointment Booking</h2>

<a href="${startFlow}">Start</a>