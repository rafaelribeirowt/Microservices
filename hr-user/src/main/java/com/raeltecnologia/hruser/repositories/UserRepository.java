package com.raeltecnologia.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raeltecnologia.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
