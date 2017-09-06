package com.spring.real.model;

public class ContactModel {

	private int id;
	private String firstname;

	private String lastname;

	private String telefhone;

	private String city;

	public ContactModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelefhone() {
		return telefhone;
	}

	public void setTelefhone(String telefhone) {
		this.telefhone = telefhone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", telefhone="
				+ telefhone + ", city=" + city + "]";
	}

}
