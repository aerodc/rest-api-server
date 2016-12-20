package com.dixi.datapool;

import com.dixi.bean.UserLogin;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liudixi on 19/12/16.
 */
@Configuration
public class UserDataPool {

    private static List<UserLogin> userPool = Collections.emptyList();

    public UserDataPool() {
        if(userPool.isEmpty()){
            this.userPool = usersGenerator();
        }
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

    public void addUser(UserLogin userLogin){
        this.getUserPool().add(userLogin);
    }
}
