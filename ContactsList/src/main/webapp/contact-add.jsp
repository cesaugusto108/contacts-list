<form action="insert" id="add-form" class="contact-form">
	<div class="container mt-3">
		<div class="row justify-content-center m-2 bg-light pt-3 pb-3">
			<div class="col-12">
				<div class="row justify-content-center text-center">
					<div class="col-lg-6">
						<div class="col-12 mt-4">
							<label for="form-name" class="form-label">Name</label>
							<input class="form-control form-control-lg" name="name" type="text" placeholder="Name" id="form-name" />
						</div>
						<div class="col-12 mt-4">
							<label for="form-email" class="form-label">Email</label>
							<input class="form-control form-control-lg" name="email" type="email" placeholder="Email" id="form-email" />
						</div>
						<div class="col-12 mt-4">
							<label for="form-phone" class="form-label">Telephone</label>
							<input class="form-control form-control-lg" name="telephone" type="number" placeholder="Telephone" id="form-phone" />
						</div>
					</div>
				</div>
			</div>
			<div class="col-12">
				<div class="row justify-content-center">
					<div class="col col-lg-12 text-center">
						<input type="button" value="Add" class="btn btn-outline-primary mt-4 form-btn" id="add-btn" />
					</div>
				</div>
			</div>
		</div>
	</div>
</form>
<div class="text-center add-cancel-btn">
    <a href="javascript:history.back()">
        <button class="btn btn-outline-secondary mt-4">Cancel</button>
    </a>
</div>
