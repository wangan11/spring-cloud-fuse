package com.wangan.springcloud.serverconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangan on 2018/7/23
 * @description
 */
 @RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${eureka.serverprovider.name}")
	private String serverName;
	@Value("${eureka.server.host}")
	private String eurekaServerHost;

	@GetMapping("getUser")
	public String getUser(){
		String object = restTemplate.getForObject("http://" + serverName + "/getUser", String.class);
		return object;
	}
}
