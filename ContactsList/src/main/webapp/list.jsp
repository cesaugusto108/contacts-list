<div class="contacts-list_main">
    <%  for (int i = 0; i < contactList.size(); i++) { %>
    <div class="container mt-3 mb-3">
        <div class="row align-items-center justify-content-between m-2 bg-light pt-3 pb-3">
            <div class="col-lg-6">
                <div class="row text-center">
                    <div class="col-lg-5 mt-2"><%= contactList.get(i).getContactName() %></div>
                    <div class="col-lg-5 mt-2"><%= contactList.get(i).getEmail() %></div>
                    <div class="col-lg-2 mt-2"><%= contactList.get(i).getTelephone() %></div>
                </div>
            </div>
            <div class="col-lg-3">
                <div class="row justify-content-center">
                    <div class="col text-center">
                        <a href="edit?id=<%= contactList.get(i).getId() %>">
                            <button class="btn btn-outline-secondary mt-2">Edit</button>
                        </a>
                        <button class="btn btn-outline-danger mt-2 ms-2">Delete</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%  } %>
</div>
