<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="ces.augusto108.model.entities.Contact" %>
<%@ page import="java.util.List" %>
<%
    List<Contact> contactList = (List<Contact>) request.getAttribute("Contacts");
%>
<!DOCTYPE html>
<html lang="en">
	<%@ include file="head.jsp" %>
	<body>
		<%@ include file="header.jsp" %> <%@ include file="list.jsp" %> <%@ include file="footer.jsp" %>
	</body>
</html>
