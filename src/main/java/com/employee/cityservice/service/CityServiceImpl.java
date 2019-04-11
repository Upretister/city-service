package com.employee.cityservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.cityservice.model.City;
import com.employee.cityservice.repository.CityRepository;
import com.google.common.base.Optional;

@Service("cityService")
public class CityServiceImpl implements CityService{

	@Autowired
	CityRepository cityRepository;
	
	@Override
	public ResponseEntity<List<City>> getAllCities() {
		List<City> cityList = cityRepository.findAll();
		return null;
	}

	@Override
	public ResponseEntity<City> getCity(long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<City> saveCity(City city) {
		//City cityResponse = cityRepository.save(city);
		Optional<City> cityType = Optional.fromNullable(cityRepository.save(city));
		//cityType.
		return null;
	}

	@Override
	public ResponseEntity<City> updateCity(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<City> deleteCity(long cityId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
