package com.wangan.springcloud.apigateway;

import com.wangan.springcloud.apigateway.zuulfilter.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

/**
 * @author wangan on 2018/7/23
 * @description
 */
 @SpringBootApplication
 @EnableZuulProxy
public class ApiGateWayApplication {

	@Bean
	public PreFilter getPreFilter(){
		return new PreFilter();
	}

	@Bean
	public PatternServiceRouteMapper serviceRouteMapper() {
		return new PatternServiceRouteMapper(
				"(?<name>^.+)-(?<version>v.+$)",
				"${version}/${name}");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayApplication.class,args);
	}


}
