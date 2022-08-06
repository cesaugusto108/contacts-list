<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="ces.augusto108.model.entities.Contact" %>
<%
    Contact c = (Contact) request.getAttribute("Contact");
%>
<!DOCTYPE html>
<html lang="en">
	<%@ include file="head.jsp" %>
	<body>
		<%@ include file="header2.jsp" %> <%@ include file="contact-edit.jsp" %> <%@ include file="footer.jsp" %>
        <script src="./scripts/validate.js"></script>
	</body>
</html>
