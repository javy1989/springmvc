package com.spring.real.repository;

import org.springframework.stereotype.Repository;

import com.spring.real.entity.User;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {

	public abstract User findByUsername(String username);
}
