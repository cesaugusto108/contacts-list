<form action="" id="form-edit">
	<div class="container mt-3">
		<div class="row justify-content-center m-2 bg-light pt-3 pb-3">
			<div class="col-12">
				<div class="row justify-content-center text-center">
					<div class="col-lg-6">
						<div class="col-12 mt-4">
							<input class="form-control form-control-lg" type="text" placeholder="" id="form-name" value="<%= c.getContactName() %>"/>
						</div>
						<div class="col-12 mt-4">
							<input class="form-control form-control-lg" type="email" placeholder="" id="form-email" value="<%= c.getEmail() %>"/>
						</div>
						<div class="col-12 mt-4">
							<input class="form-control form-control-lg" type="number" placeholder="" id="form-phone" value="<%= c.getTelephone() %>"/>
						</div>
					</div>
				</div>
			</div>
			<div class="col-12">
				<div class="row justify-content-center">
					<div class="col text-center">
						<input type="button" class="btn btn-outline-primary mt-4" id="confirm-btn" value="Confirm edit" />
					</div>  
				</div>
			</div>
		</div>
	</div>
</form>
