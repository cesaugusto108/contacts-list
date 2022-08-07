<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="ces.augusto108.model.entities.Contact" %>
<%
    Contact c = (Contact) request.getAttribute("Contact");
%>
<!DOCTYPE html>
<html lang="en">
	<%@ include file="head.jsp" %>
    <body>
        <div class="contacts-dark_panel">
            <div class="text-center text-light confirm-delete_msg">Are you sure you want to delete this contact?</div>
            <a href="Contacts">
                <button class="btn btn-secondary mb-5 delete-cancel-btn">Cancel</button>
            </a>
            <a href="delete?id=<%= c.getId() %>">
                <button class="btn btn-danger mt-2" id="confirm-btn">Confirm delete</button>
            </a>
        </div>
    </body>
</html>

