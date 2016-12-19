package com.dixi.common;

/**
 * Created by liudixi on 19/12/16.
 */
public class RestResult<T> {

    private T data;

    private String message;

    public static <T> RestResult<T> newInstance(){
        return new RestResult<>();
    }

    public RestResult() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
