package com.manufacture.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacture.manage.entity.ManufacturerEntity;
import com.manufacture.manage.exception.ManufactureNotFound;
import com.manufacture.manage.mapper.ManufacturerEntityMapper;
import com.manufacture.manage.mapper.ManufacturerModelMapper;
import com.manufacture.manage.model.ManufacturerModel;
import com.manufacture.manage.repository.ManufactureRepository;
import com.manufacture.manage.service.ManufactureService;

@Service
public class ManufactureServiceImpl implements ManufactureService {

	@Autowired
	private ManufactureRepository manufactureRepository;

	@Autowired
	private ManufacturerEntityMapper manufacturerEntityMapper;

	@Autowired
	private ManufacturerModelMapper manufacturerModelMapper;

	@Override
	public void createManufacture(ManufacturerModel manufacturerModel) {
		manufactureRepository.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}
	@Override
	public void updateManufacture(ManufacturerModel manufacturerModel) {
		manufactureRepository.save(manufacturerEntityMapper.modelToManufacturerEntity(manufacturerModel));
	}


	@Override
	public void deleteByManufacture(int manufacturerId) {
		manufactureRepository.deleteById(manufacturerId);
	}


	@Override
	public ManufacturerModel findBymanufacturerId(int manufacturerId) {
		ManufacturerModel manufacturerModel;
		Optional<ManufacturerEntity> manufacturerEntityOptional = manufactureRepository.findById(manufacturerId);
		if (manufacturerEntityOptional.isPresent()) {
			manufacturerModel = manufacturerModelMapper.entityToManufacturerModel(manufacturerEntityOptional.get());
		} else {
			throw new ManufactureNotFound("manufacturer is not found for given manufactureId--->" + manufacturerId);
		}
		return manufacturerModel;
	}

	}

