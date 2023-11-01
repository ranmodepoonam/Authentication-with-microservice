package com.osc.cacheservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	   String email;
	   String contact;
	   String DOB;
	  // String password;
	   String OTP;

}
