package com.dixi.common;

/**
 * Created by liudixi on 19/12/16.
 */
public class RestResultGenerator {

    public static <T>RestResult<T> genSucessResult(String message, T data){

        RestResult<T> restResult=RestResult.newInstance();

        restResult.setData(data);

        restResult.setMessage(message);

        return restResult;

    }

    public static <T>RestResult<T> genErrorResult(String message, T data){

        RestResult<T> restResult=RestResult.newInstance();
        restResult.setMessage(message);
        restResult.setData(data);
        return restResult;
    }
}
