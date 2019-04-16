package com.employee.cityservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.employee.cityservice.model.City;

public interface CityService {
	
	List<City> getAllCities();
	City getCity(Long cityId) throws NoSuchFieldException;
	ResponseEntity<City> saveCity(City city);
	ResponseEntity<City> updateCity(City city);
	ResponseEntity<City> deleteCity(Long cityId);

}
