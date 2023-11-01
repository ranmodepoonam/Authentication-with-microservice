package com.osc.userservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.osc.proto.storeUserDetailsGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class ApplicationInitialization {

//	private ManagedChannel channel;
//
//	@Bean
//	public storeUserDetailsBlockingStub storeUserDetailsServiceBlockingStub() {
//		channel = ManagedChannelBuilder.forAddress(ConfiguredProperties.getCacheStaticGrpcHost(),
//				ConfiguredProperties.getCacheStaticGrpcPort()).usePlaintext().build();
//
//		return storeUserDetailsGrpc.newBlockingStub(channel);
//	}
	
	 @Bean
	    public ManagedChannel managedChannel() {
	        return ManagedChannelBuilder.forAddress(ConfiguredProperties.getCacheStaticGrpcHost(), ConfiguredProperties.getCacheStaticGrpcPort())
	                .usePlaintext()
	                .build();
	    }

	    @Bean
	    public storeUserDetailsGrpc.storeUserDetailsBlockingStub storeUserDetailsBlockingStub(ManagedChannel channel) {
	        return storeUserDetailsGrpc.newBlockingStub(channel);
	    }

}
