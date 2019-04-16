package com.employee.cityservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="city")
/*@Getter
@Setter
@Data*/
/*@NoArgsConstructor*/
/*@JsonSerialize(as=Country.class)*/
//@AllArgsConstructor(onConstructor=@({@JsonCreator(mode = JsonCreator.Mode.DELEGATING)}))

public class City implements Serializable {
	
	private static final long serialVersionUID = 10L;

	@Id
	@Column(name="city_id")
	private Long cityId;
	
	/*@Column(name="country_id")
	private long countryId;*/
	
	@Column(name="city_name")
	private String city;
	
	
	@ManyToOne
	@JoinColumn(name="country_id",nullable=false)
	private Country country;
	
	@JsonCreator
	public City() {}
	
	/*public City(@JsonProperty("cityId") long cityId, @JsonProperty("city") String city,
			@JsonProperty("countryId") long countryId) {
		this.cityId = cityId;
		this.city = city;
		this.countryId = countryId;
	}*/
	
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	/*public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}*/
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	

}
