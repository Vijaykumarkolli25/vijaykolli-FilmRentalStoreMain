package com.sprint.entity;

import java.sql.Timestamp;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@Column(name = "COUNTRY_ID", columnDefinition = "NUMBER(22)")
	private int country_Id;
	@Column(name = "COUNTRY", nullable = false, columnDefinition = "VARCHAR2(50)")
	private String country;
	@Column(name = "LAST_DATE", columnDefinition = "TIMESTAMP")
	private Timestamp last_date;
	
	@OneToMany(mappedBy = "country", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private Set<City> city;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int country_Id, String country, Timestamp last_date) {
		super();
		this.country_Id = country_Id;
		this.country = country;
		this.last_date = last_date;
	}

	public int getCountry_Id() {
		return country_Id;
	}

	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getLast_date() {
		return last_date;
	}

	public void setLast_date(Timestamp last_date) {
		this.last_date = last_date;
	}
}

