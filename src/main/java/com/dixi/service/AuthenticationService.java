package com.dixi.service;

import com.dixi.bean.UserLogin;
import com.dixi.datapool.UserDataPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by liudixi on 19/12/16.
 */
@Service
public class AuthenticationService {

    @Autowired
    UserDataPool userDataPool ;

    public String authUser(UserLogin userLogin){

        boolean isExist=userDataPool.getUserPool().contains(userLogin);

        if(isExist){
            return "user exists";
        }else{
            userDataPool.addUser(userLogin);
            System.out.println("userDatapool length "+userDataPool.getUserPool().size());
            return "user not exists!";
        }

    }
}
