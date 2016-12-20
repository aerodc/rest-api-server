package com.dixi.jwt;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by liudixi on 20/12/16.
 */
@Configuration
public class JwtFilterConfig extends WebMvcConfigurerAdapter{

    @Bean
    public FilterRegistrationBean getJwtFilter(){

        JwtFilter jwtFilter = new JwtFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(jwtFilter);

        filterRegistrationBean.addUrlPatterns("/api/users");
        filterRegistrationBean.setOrder(1);

        return filterRegistrationBean;

    }
}
