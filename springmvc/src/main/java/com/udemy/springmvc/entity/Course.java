package com.udemy.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the course database table.
 * 
 */

@Entity
@Table(name = "course")
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "id")
	private int id;

	@Column(length = 300, name = "description")
	private String description;

	@Column(name = "hours")
	private int hours;

	@Column(length = 150, name = "name")
	private String name;

	@Column(name = "price")
	private int price;

	public Course() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + ", hours=" + hours + ", name=" + name + ", price="
				+ price + "]";
	}
	

}