package com.learn.secuirty.repo;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo extends JpaRepository<User, Integer> {

	
}
