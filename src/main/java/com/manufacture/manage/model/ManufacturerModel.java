package com.manufacture.manage.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class ManufacturerModel {
	private int manufacturerId;

	@NotBlank(message = "companyname should not be null")
	private String companyName;

	@NotBlank(message = "registrationNumber should not be null")
	private String registrationNumber;
	private LocalDate dateOfRegistration;
	private String description;

	private List<ContactModel> contactModel;
	private AddressModel addressModel;

	public ManufacturerModel() {

	}

	public ManufacturerModel(int manufacturerId,
			@NotBlank(message = "companyname should not be null") String companyName,
			@NotBlank(message = "registrationNumber should not be null") String registrationNumber,
			LocalDate dateOfRegistration, String description, List<ContactModel> contactModel,
			AddressModel addressModel) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.dateOfRegistration = dateOfRegistration;
		this.description = description;
		this.contactModel = contactModel;
		this.addressModel = addressModel;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ContactModel> getContactModel() {
		return contactModel;
	}

	public void setContactModel(List<ContactModel> contactModel) {
		this.contactModel = contactModel;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	@Override
	public String toString() {
		return "ManufacturerModel [manufacturerId=" + manufacturerId + ", companyName=" + companyName
				+ ", registrationNumber=" + registrationNumber + ", dateOfRegistration=" + dateOfRegistration
				+ ", description=" + description + ", contactModel=" + contactModel + ", addressModel=" + addressModel
				+ "]";
	}

}
