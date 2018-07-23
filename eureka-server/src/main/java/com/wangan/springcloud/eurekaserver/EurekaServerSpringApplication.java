package com.wangan.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * @author wangan on 2018/7/23
 * @description
 */
 @SpringBootApplication
 @EnableEurekaServer
 @EnableConfigServer
public class EurekaServerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerSpringApplication.class,args);
	}

}
