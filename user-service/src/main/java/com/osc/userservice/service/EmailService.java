package com.osc.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osc.userservice.dao.UserRepo;
import com.osc.userservice.utils.OTPGenerator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailService {
	
	@Autowired
	private UserRepo userRepo;
	
	public boolean isEmailExist(String email) {
		
		boolean isEmailExist=true;
		try {
			
			isEmailExist =userRepo.existsByEmail(email);
		}catch (Exception e) {
			log.error(email+" : "+e);
		}
		return isEmailExist;
	}

	public String generateOTP() {
		String otp = null;
		try {
			otp = OTPGenerator.generateOTP();
			log.info("in generateOTP.. otp : "+otp);
			
			
		}catch (Exception e) {
			log.error("OTP is not generated :");
		}
		return otp;
		
	}

}
