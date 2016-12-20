package com.dixi.service;

import com.dixi.bean.UserLogin;
import com.dixi.datapool.UserPoolBean;
import com.dixi.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by liudixi on 19/12/16.
 */
@Service
public class AuthenticationService {


    @Autowired
    UserPoolBean userPoolBean;

    public String authUser(UserLogin userLogin) throws UserNotFoundException {

        boolean isExist=userPoolBean.getUserPool().contains(userLogin);

        if(isExist){
            return "user exists";
        }else{
           throw new UserNotFoundException("user not exists!!");
        }

    }
}
