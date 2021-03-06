package com.dixi.datapool;

import com.dixi.bean.UserLogin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liudixi on 20/12/16.
 */
public class UserPoolBean {

    private List<UserLogin> userPool = Collections.emptyList();

    public UserPoolBean() {
        this.userPool = usersGenerator();
    }

    private List<UserLogin> usersGenerator(){
        UserLogin user1= new UserLogin("dev");
        UserLogin user2= new UserLogin("test");
        UserLogin user3= new UserLogin("demo");

        List<UserLogin> result = new ArrayList<>();

        result.add(user1);
        result.add(user2);
        result.add(user3);

        return result;
    }

    public List<UserLogin> getUserPool() {
        return userPool;
    }

    public synchronized void addUser(UserLogin userLogin){
        this.getUserPool().add(userLogin);
    }

}
