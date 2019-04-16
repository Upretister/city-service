package com.employee.cityservice.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.cityservice.model.City;
import com.employee.cityservice.service.CityService;

@RestController
@RequestMapping(value="api/v1")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="city",method = RequestMethod.GET)
	public List<City> getAllCities(){
		return cityService.getAllCities();
	}
	
	@RequestMapping(value="city/{cityId}",method = RequestMethod.GET)
	public City getCity(@PathVariable("cityId") Long cityId) throws NoSuchFieldException{
		System.out.println("CIty ID COntroller :: "+cityId);
		return cityService.getCity(cityId);
	}
	
	@RequestMapping(value="city",method = RequestMethod.POST)
	public ResponseEntity<City> saveCity(@RequestBody City city){
		System.out.println("Inside Controller::SAVE "+city.getCity());
		return cityService.saveCity(city);
	}
	
	public ResponseEntity<City> updateCity(@RequestBody City city){
		return cityService.updateCity(city);
	}
	
	@RequestMapping(value="city",method = RequestMethod.DELETE)
	public ResponseEntity<City> updateCity(@PathParam("cityId") Long cityId){
		return cityService.deleteCity(cityId);
    }
}
