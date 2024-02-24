package com.javaman.userregistrationlogin.repository;

import com.javaman.userregistrationlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   
	User findByEmail(String email);
}
