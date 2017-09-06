package com.spring.real.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "role", "username" }))
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userrole", unique = true, nullable = false)
	private Integer userrole;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "username", nullable = false)
	private User user;
	@Column(name = "role", nullable = false,length=45)
	private String role;

	public UserRole() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getUserrole() {
		return userrole;
	}

	public void setUserrole(Integer userrole) {
		this.userrole = userrole;
	}

}
