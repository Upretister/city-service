package com.employee.cityservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.employee.cityservice.service.CityService;
import com.employee.cityservice.model.City;
import com.employee.cityservice.repository.CityRepository;
import com.google.common.base.Optional;

@Service("cityService")
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	public List<City> getAllCities() {
		List<City> cityList = cityRepository.findAll();
		return cityList;
	}

	public City getCity(Long cityId) throws NoSuchFieldException {
		// TODO Auto-generated method stub
		//City cit = cityRepository.findById(cityId);
		return cityRepository.findById(cityId).get()/*orElseThrow(() -> new NoSuchFieldException("No user found with username " + cityId))*/;
	}

	public ResponseEntity<City> saveCity(City city) {
		System.out.println("Inside Service::SAVE " + city.getCity() + city.getCountry().getCountryId());
		City cityResponse = cityRepository.save(city);
		/*
		 * Optional<City> cityType = Optional.fromNullable(cityRepository.save(city));
		 * if(cityType.isPresent()) { new
		 * ResponseEntity<City>(cityRepository.save(city), HttpStatus.OK); }
		 */
		// cityType.
		return new ResponseEntity<City>(HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<City> updateCity(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<City> deleteCity(long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<City> deleteCity(Long cityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
