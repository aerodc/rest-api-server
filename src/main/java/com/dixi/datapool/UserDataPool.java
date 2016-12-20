package com.dixi.datapool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Created by liudixi on 19/12/16.
 */
@Configuration
public class UserDataPool {

    @Bean
    public UserPoolBean createUserPoolBean(){
        return new UserPoolBean();
    }
}
