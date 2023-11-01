package com.osc.userservice.utils;

import java.util.concurrent.ThreadLocalRandom;

public class OTPGenerator {

	private static final int OTP_LENGTH = 6;

    public static String generateOTP() {
    	
        // Using ThreadLocalRandom for better randomness
        ThreadLocalRandom random = ThreadLocalRandom.current();

        // Generating a random OTP
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(random.nextInt(0, 10));
        }

        return otp.toString();
    }
}
