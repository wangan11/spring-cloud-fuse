package com.wangan.springcloud.serverprovider.controller;

import com.wangan.springcloud.serverprovider.domin.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangan on 2018/7/23
 * @description
 */
 @RestController
public class UserController {

	@GetMapping("getUser")
	public User getUser(){
		User user=new User();
		user.setId(1);
		user.setName("wangan");
		return user;
	}

}
