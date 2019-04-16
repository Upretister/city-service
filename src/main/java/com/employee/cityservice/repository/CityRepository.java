package com.employee.cityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.cityservice.model.City;

@Repository("cityRepository")
public interface CityRepository extends JpaRepository<City, Long> {
	
	public City save(City city);
}
