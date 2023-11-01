package com.osc.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.osc.userservice.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

    @Query(value =  "SELECT count(*)>0 FROM public.\"userdb\"\r\n"
    		+ "where \"email\"='poonamranmode1989@gmail.com'", nativeQuery = true)
    boolean existsByEmail(String email);
	

}
