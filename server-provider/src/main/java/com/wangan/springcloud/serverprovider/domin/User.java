package com.wangan.springcloud.serverprovider.domin;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author wangan on 2018/7/23
 * @description
 */
public class User {

	private Integer id;
	private String name;

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
