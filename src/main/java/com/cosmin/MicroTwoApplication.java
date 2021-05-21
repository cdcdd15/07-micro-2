package com.cosmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.cosmin.logs.StaticLogs;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class MicroTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTwoApplication.class, args);
		String message = "is started";
		StaticLogs.staticLogs(log, message);
	}
}
