package com.wangan.springcloud.serverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangan on 2018/7/23
 * @description
 */
 @SpringBootApplication
 @EnableDiscoveryClient
public class ServerproviderApplictaion {

	public static void main(String[] args) {
		SpringApplication.run(ServerproviderApplictaion.class,args);
	}

}
