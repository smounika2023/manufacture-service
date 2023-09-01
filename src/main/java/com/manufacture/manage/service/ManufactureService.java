package com.manufacture.manage.service;

import com.manufacture.manage.model.ManufacturerModel;

public interface ManufactureService {
	
	public void createManufacture(ManufacturerModel manufactureModel);

	public void updateManufacture(ManufacturerModel manufactureModel);

	public void deleteByManufacture(int ProductId);

	public ManufacturerModel findBymanufacturerId(int manufacturerId);

}
