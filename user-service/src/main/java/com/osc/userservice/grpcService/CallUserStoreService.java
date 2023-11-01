package com.osc.userservice.grpcService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osc.proto.storeUserDetailsGrpc;
import com.osc.proto.userDetailsRequest;
import com.osc.proto.userDetailsResponse;
import com.osc.userservice.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CallUserStoreService {

	@Autowired
	private storeUserDetailsGrpc.storeUserDetailsBlockingStub blockingStub;
	
	public String storeUserDetails(UserDto userDetails, String otp) {
		String userId = "user"+otp;
		log.info("in grpc client userId : "+userId);
		log.info(">>"+userDetails.getName()+" : "+userDetails.getContact()+" : "+userDetails.getDOB()+" : "+userDetails.getEmail());
		userDetailsRequest request=null;
		try {
		 request = userDetailsRequest.newBuilder().setUserId(userId).setName(userDetails.getName()).setContact(userDetails.getContact()).setDOB(userDetails.getDOB()).setEmail(userDetails.getEmail()).setOTP(otp).build();
		}catch (Exception e) {
			log.error("exception : "+e);
		}
		log.info("request for grpc call : "+request);
		userDetailsResponse response = this.blockingStub.getTemplateInfo(request);
		log.info("response from cache service : "+response);
		return response.toString();
	}
}

