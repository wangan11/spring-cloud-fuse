package com.wangan.springcloud.configclient.config;


import com.wangan.springcloud.configclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangan on 2018/7/12
 * @description
 */
@EnableConfigurationProperties(User.class)
public class WanganConfiguration {

}
