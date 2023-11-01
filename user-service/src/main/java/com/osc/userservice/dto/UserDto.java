package com.osc.userservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	
	private String name;
	private String email;
	private String contact;
	@JsonProperty("DOB")
	private String DOB;

}
