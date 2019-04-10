package com.employee.cityservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="city")
@Getter
@Setter
@NoArgsConstructor
public class CityBean implements Serializable {
	
	private static final long serialVersionUID = 10L;

	@Id
	@Column(name="city_id")
	private long cityId;
	
	@Column(name="country_id")
	private long countryId;
	
	@Column(name="city_name")
	private String city;
	
	/*
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
*/
}
