package com.manufacture.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.manufacture.manage.entity.AddressEntity;
import com.manufacture.manage.entity.ContactEntity;
import com.manufacture.manage.entity.ManufacturerEntity;
import com.manufacture.manage.model.AddressModel;
import com.manufacture.manage.model.ContactModel;
import com.manufacture.manage.model.ManufacturerModel;

@Component
public class ManufacturerModelMapper {

	public ManufacturerModel entityToManufacturerModel(ManufacturerEntity manufacturerEntity) {
		ManufacturerModel manufacturerModel = new ManufacturerModel();
		BeanUtils.copyProperties(manufacturerEntity, manufacturerModel);
		manufacturerModel.setAddressModel(entityToAddressModel(manufacturerEntity.getAddressEntity()));
		manufacturerModel.setContactModel(entitiesToContactModels(manufacturerEntity.getContactEntity()));
		return manufacturerModel;
	}

	public AddressModel entityToAddressModel(AddressEntity addressEntity) {
		AddressModel AddressModel = new AddressModel();
		BeanUtils.copyProperties(addressEntity, AddressModel);
		return AddressModel;
	}

	public ContactModel entityToContactModel(ContactEntity Contactentity) {
		ContactModel contactModel = new ContactModel();
		BeanUtils.copyProperties(Contactentity, contactModel);
		return contactModel;
	}

	public List<ContactModel> entitiesToContactModels(List<ContactEntity> contactEntities) {
		return contactEntities.stream().map(contactEntity -> entityToContactModel(contactEntity))
				.collect(Collectors.toList());
	}
}
