package com.osc.cacheservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.osc.cacheservice.cache.UserCache;
import com.osc.proto.storeUserDetailsGrpc.storeUserDetailsImplBase;
import com.osc.proto.userDetailsRequest;
import com.osc.proto.userDetailsResponse;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Slf4j
public class StoreUserDetailsService extends storeUserDetailsImplBase{
	
	@Autowired
	private UserCache cache;

	@Override
	public void getTemplateInfo(userDetailsRequest request, StreamObserver<userDetailsResponse> responseObserver) {
		// TODO Auto-generated method stub
		
		
		 try {
			 
			 			 log.info("in grpc service : " + request);
			 		        cache.saveUser(request.getUserId(), request.getName(), request.getEmail(), request.getContact(), request.getDOB(), request.getOTP());
			 		        userDetailsResponse response = userDetailsResponse.newBuilder().setMessage("User information Saved successfully").build();
			 		        responseObserver.onNext(response);
			 		        log.info("response to grpc client : "+response);
			 		        // You should throw an error here if needed, before completing the response
			 		       // throw new RuntimeException("An error occurred during processing.");
			 		    } catch (Exception e) {
			 		        // If an error occurs, notify the client by calling onError
			 		        responseObserver.onError(Status.INTERNAL
			 		            .withDescription("An error occurred during processing.")
			 		            .withCause(e)
			 		            .asException());
			 		    } finally {
			 		        // Complete the response stream
			 		        responseObserver.onCompleted();
			 	        }
	}

//	@Override
//	public void getTemplateInfo(userDetailsRequest request, StreamObserver<userDetailsResponse> responseObserver) {
//		super.getTemplateInfo(request, responseObserver);
//
//		 try {
//
//			 log.info("in grpc service : " + request);
//		        cache.saveUser(request.getUserId(), request.getName(), request.getEmail(), request.getContact(), request.getDOB(), request.getOTP());
//		        userDetailsResponse response = userDetailsResponse.newBuilder().setMessage("User information Saved successfully").build();
//		        responseObserver.onNext(response);
//
//		        // You should throw an error here if needed, before completing the response
//		        throw new RuntimeException("An error occurred during processing.");
//		    } catch (Exception e) {
//		        // If an error occurs, notify the client by calling onError
//		        responseObserver.onError(Status.INTERNAL
//		            .withDescription("An error occurred during processing.")
//		            .withCause(e)
//		            .asException());
//		    } finally {
//		        // Complete the response stream
//		        responseObserver.onCompleted();
//	        }
//	}

}

