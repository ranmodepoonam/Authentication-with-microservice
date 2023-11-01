package com.osc.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="userdb")
public class User {
	
	@Id
	private int userId;
	
	private String name;
	private String email;
	private String contact;
	@JsonProperty("DOB")
	private String DOB;
	private String password;

}
