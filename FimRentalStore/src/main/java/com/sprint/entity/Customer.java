package com.sprint.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID", columnDefinition = "NUMBER(22)")
	private int customer_Id;
	
	@Column(name = "FIRST_NAME", nullable = false , columnDefinition = "VARCHAR2(45)")
	private String first_name;
	
	@Column(name = "LAST_NAME", nullable = false , columnDefinition = "VARCHAR2(45)")
	private String last_name;
	
	@Column(name = "EMAIL", columnDefinition = "VARCHAR2(50)")
	private char email;
	
	@Column(name = "ACTIVE", nullable = false, columnDefinition = "BIT(1)")
	private char active;
	
	@Column(name = "CREATE_DATE", nullable = false, columnDefinition = "DATE")
	private Date create_date;
	
	@Column(name = "LAST_UPDATE",nullable = false, columnDefinition = "TIMESTAMP")
	private Timestamp last_date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_Id", referencedColumnName = "ADDRESS_ID", nullable = false)
	private Address address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "store_Id", referencedColumnName = "STORE_ID", nullable = false)
	private Store store;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customer_Id, String first_name, String last_name, char email, char active, Date create_date,
			Timestamp last_date) {
		super();
		this.customer_Id = customer_Id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.active = active;
		this.create_date = create_date;
		this.last_date = last_date;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public char getEmail() {
		return email;
	}

	public void setEmail(char email) {
		this.email = email;
	}

	public int getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Timestamp getLast_date() {
		return last_date;
	}

	public void setLast_date(Timestamp last_date) {
		this.last_date = last_date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
}

