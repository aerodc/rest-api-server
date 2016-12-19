package com.dixi.controller;

import com.dixi.bean.UserLogin;
import com.dixi.common.RestResult;
import com.dixi.common.RestResultGenerator;
import com.dixi.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by liudixi on 19/12/16.
 */

@RestController
@RequestMapping("api")
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @RequestMapping(value="/auth", method = RequestMethod.POST)
    public RestResult<String> auth(@Valid @RequestBody UserLogin userLogin){

        String result = authenticationService.authUser(userLogin);
        return RestResultGenerator.genSucessResult("result is",result);
    }
}
