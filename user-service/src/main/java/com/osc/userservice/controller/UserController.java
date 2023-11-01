package com.osc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osc.userservice.dao.UserRepo;
import com.osc.userservice.dto.ResponseData;
import com.osc.userservice.dto.UserDto;
import com.osc.userservice.entity.User;
import com.osc.userservice.grpcService.CallUserStoreService;
import com.osc.userservice.service.EmailService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private EmailService emailValidationService;
	
	@Autowired
	private CallUserStoreService callUserStoreService;
	
	@Autowired UserRepo repo;
	
	@PostMapping("/signUp")
	public ResponseEntity<ResponseData> signUp(@RequestBody UserDto signUpRequest){
		try {
			log.info("signUpRequest....."+signUpRequest.toString());
			boolean isEmailExist = emailValidationService.isEmailExist(signUpRequest.getEmail());
			if(!isEmailExist) {
				log.info("email does not exist : "); 
				String OTP = emailValidationService.generateOTP();
				callUserStoreService.storeUserDetails(signUpRequest, OTP);
			}
			log.info("email is exist : "+isEmailExist); 

		}catch(Exception e) {
			log.error("in singUp : "+e);
		}
		return ResponseEntity.ok(new ResponseData("200",null));
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<ResponseData> addUser(@RequestBody UserDto addRequest){
		User savedUser=null;
		try {
			User user = new User();
			user.setName(addRequest.getName());
			user.setContact(addRequest.getContact());
			user.setEmail(addRequest.getEmail());
			user.setDOB(addRequest.getDOB());
			savedUser = repo.save(user);
		}catch(Exception e) {
			log.error("user not added to db ");
		}
		return ResponseEntity.ok(new ResponseData("200",savedUser.toString()));
	}
	
	

}
