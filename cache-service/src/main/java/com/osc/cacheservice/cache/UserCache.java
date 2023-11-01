package com.osc.cacheservice.cache;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.osc.cacheservice.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCache {
	
    @Autowired
    private HazelcastInstance hazelcastInstance;
	
	private IMap<String, User> userStore = null;
	
	@PostConstruct
	public void init() {
		userStore = this.hazelcastInstance.getMap("userStore-map");
	}
	
	public void saveUser(String userId,String name,String email,String contact,String DOB,String OTP) {
		
		User user = new User(name, email, contact, DOB, OTP);
		log.info("user object is created");
		userStore.put(userId, user);
		log.info("saved user in hazelcast Map : >>"+this.userStore.get(userId));
		log.info("userId and user object saved");
	}
	

}
