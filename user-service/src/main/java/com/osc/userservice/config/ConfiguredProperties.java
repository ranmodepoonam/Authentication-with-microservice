package com.osc.userservice.config;

import com.osc.userservice.utils.AppConstants;

public class ConfiguredProperties {

	public static String getCacheStaticGrpcHost() {
		return AppConstants.CACHE_SERVICE_HOST;
	}

	public static int getCacheStaticGrpcPort() {
		return AppConstants.CACHE_SERVICE_PORT;
	}
}
