"use strict";

const pageElements = {
	contactName: document.getElementById("form-name"),
	email: document.getElementById("form-email"),
	telephone: document.getElementById("form-phone"),
	formBtn: document.querySelector(".form-btn"),
	form: document.querySelector(".contact-form"),
};

// Functions

function checkNameField() {
	if (pageElements.contactName.value === "") {
		pageElements.contactName.style.backgroundColor = "pink";
		pageElements.contactName.placeholder = "This field is required";
		pageElements.contactName.style.height = "48px";
		pageElements.contactName.style.fontSize = "0.8rem";
	}
}

function checkPhoneField() {
	if (pageElements.telephone.value === "") {
		pageElements.telephone.style.backgroundColor = "pink";
		pageElements.telephone.placeholder = "This field is required";
		pageElements.telephone.style.height = "48px";
		pageElements.telephone.style.fontSize = "0.8rem";
	}
}

function validate() {
	if (pageElements.contactName.value === "" || pageElements.telephone.value === "") {
		checkNameField();
		checkPhoneField();
	} else {
		pageElements.form.submit();
	}
}

function restoreNameField() {
	pageElements.contactName.style.backgroundColor = "white";
	pageElements.contactName.placeholder = "Name";
	pageElements.contactName.style.fontSize = "1.25rem";
}

function restorePhoneField() {
	pageElements.telephone.style.backgroundColor = "white";
	pageElements.telephone.placeholder = "Telephone";
	pageElements.telephone.style.fontSize = "1.25rem";
}

// Event Listeners

pageElements.formBtn.addEventListener("click", validate);
pageElements.contactName.addEventListener("click", restoreNameField);
pageElements.telephone.addEventListener("click", restorePhoneField);
