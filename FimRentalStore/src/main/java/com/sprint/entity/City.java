package com.sprint.entity;

import java.sql.Timestamp;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "City")
public class City {

	@Id
	@Column(name = "CITY_ID", columnDefinition = "NUMBER(22)")
	private int city_Id;
	
	@Column(name = "CITY", nullable = false, columnDefinition = "VARCHAR2(50)")
	private char city;
	
	@Column(name = "LAST_UPDATE", nullable = false, columnDefinition = "TIMESTAMP")
	private Timestamp last_update;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_Id", referencedColumnName = "COUNTRY_ID", columnDefinition = "NUMBER(22)")
	private Country country;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int city_Id, char city, Timestamp last_update) {
		super();
		this.city_Id = city_Id;
		this.city = city;
		this.last_update = last_update;
	}

	public int getCity_Id() {
		return city_Id;
	}

	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}

	public char getCity() {
		return city;
	}

	public void setCity(char city) {
		this.city = city;
	}

	public Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
}

