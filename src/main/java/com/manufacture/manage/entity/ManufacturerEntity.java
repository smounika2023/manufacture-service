package com.manufacture.manage.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacturer", schema = "manufacture_schema")
public class ManufacturerEntity {

	@Id
	@Column(name = "manufacturer_id")
	private int manufacturerId;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "registration_number")
	private String registrationNumber;

	@Column(name = "date_of_registration")
	private LocalDate dateOfRegistration;

	private String description;

	@OneToOne
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;

	@JsonManagedReference("manufacturer_contact")
	@OneToMany(mappedBy = "manufacturerEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ContactEntity> contactEntity;

	public ManufacturerEntity() {

	}

	public ManufacturerEntity(int manufacturerId, String companyName, String registrationNumber,
			LocalDate dateOfRegistration, String description, AddressEntity addressEntity,
			List<ContactEntity> contactEntity) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyName = companyName;
		this.registrationNumber = registrationNumber;
		this.dateOfRegistration = dateOfRegistration;
		this.description = description;
		this.addressEntity = addressEntity;
		this.contactEntity = contactEntity;
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

	public AddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}

	public List<ContactEntity> getContactEntity() {
		return contactEntity;
	}

	public void setContactEntity(List<ContactEntity> contactEntity) {
		this.contactEntity = contactEntity;
	}

}
