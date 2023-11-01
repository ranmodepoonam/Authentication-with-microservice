package com.osc.cacheservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.NetworkConfig;

@Configuration
public class HazelcastConfig {

	@Bean
	public Config myHazelcastConfig() {

		Config config = new Config();
		NetworkConfig networkConfig = config.getNetworkConfig();
		networkConfig.setPort(5701);
		networkConfig.setPortAutoIncrement(true);
		networkConfig.getJoin().getMulticastConfig().setEnabled(false);
		networkConfig.getJoin().getTcpIpConfig().setEnabled(false);
		networkConfig.getInterfaces().setEnabled(true).addInterface("192.168.1.*");
		networkConfig.getInterfaces().setEnabled(true).addInterface("127.0.0.1");
		return config;
	}
}
