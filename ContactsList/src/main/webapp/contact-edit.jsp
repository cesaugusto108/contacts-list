<form action="update" id="form-edit" class="contact-form">
	<div class="container mt-3">
		<div class="row justify-content-center m-2 bg-light pt-3 pb-3">
			<div class="col-12">
				<div class="row justify-content-center text-center">
					<div class="col-lg-6">
						<div class="col-12 mt-4" style="display: none">
							<input class="form-control form-control-lg" type="text" name="id" placeholder="" id="form-id" value="<%= c.getId() %>" />
						</div>
						<div class="col-12 mt-4">
							<label for="form-name" class="form-label">Name</label>
							<input
								class="form-control form-control-lg"
								type="text"
								name="name"
								placeholder=""
								id="form-name"
								value="<%= c.getContactName() %>"
							/>
						</div>
						<div class="col-12 mt-4">
                            <label for="form-email" class="form-label">Email</label>
                            <input class="form-control form-control-lg" type="email" name="email" placeholder="" id="form-email" value="<%= c.getEmail() %>" />
						</div>
						<div class="col-12 mt-4">
                            <label for="form-phone" class="form-label">Telephone</label>
							<input
								class="form-control form-control-lg"
								type="number"
								name="telephone"
								placeholder=""
								id="form-phone"
								value="<%= c.getTelephone() %>"
							/>
						</div>
					</div>
				</div>
			</div>
			<div class="col-12">
				<div class="row justify-content-center">
					<div class="col col-lg-12 text-center">
						<input type="button" value="Confirm edit" class="btn btn-outline-primary mt-4 form-btn" id="edit-btn" />
					</div>
				</div>
			</div>
		</div>
	</div>
</form>
<div class="text-center edit-cancel-btn">
    <a href="Contacts">
        <button class="btn btn-outline-secondary mt-4">Cancel</button>
    </a>
</div>
