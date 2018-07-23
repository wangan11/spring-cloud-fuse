package com.wangan.springcloud.configclient.controller;

import com.wangan.springcloud.configclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangan on 2018/7/23
 * @description
 */
 @RestController
 @ConditionalOnBean(User.class)
public class ConfigClientController {

	@Autowired
	private User user;


	@RequestMapping("/users")
	public User getUser1(){
		return user;
	}

}

