package com.employee.cityservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.cityservice.model.City;

public interface CityService {
	
	ResponseEntity<List<City>> getAllCities();
	ResponseEntity<City> getCity(long cityId);
	ResponseEntity<City> saveCity(City city);
	ResponseEntity<City> updateCity(City city);
	ResponseEntity<City> deleteCity(long cityId);

}
