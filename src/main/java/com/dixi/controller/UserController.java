package com.dixi.controller;

import com.dixi.bean.UserLogin;
import com.dixi.common.RestResult;
import com.dixi.common.RestResultGenerator;
import com.dixi.datapool.UserPoolBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liudixi on 20/12/16.
 */
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserPoolBean userPoolBean;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public RestResult<List<UserLogin>> getUserList(){

        return RestResultGenerator.genSucessResult("OK",userPoolBean.getUserPool());
    }
}
