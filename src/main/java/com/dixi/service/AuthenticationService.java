package com.dixi.service;

import com.dixi.bean.UserLogin;
import com.dixi.datapool.UserPoolBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by liudixi on 19/12/16.
 */
@Service
public class AuthenticationService {


    @Autowired
    UserPoolBean userPoolBean;

    public String authUser(UserLogin userLogin){

        boolean isExist=userPoolBean.getUserPool().contains(userLogin);

        if(isExist){
            return "user exists";
        }else{
            userPoolBean.addUser(userLogin);
            System.out.println("userDatapool length "+userPoolBean.getUserPool().size());
            return "user not exists!";
        }

    }
}
