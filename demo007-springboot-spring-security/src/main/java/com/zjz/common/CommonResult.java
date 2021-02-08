package com.zjz.common;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public CommonResult(){}

    public CommonResult(int code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult<T> success(T data){
        return new CommonResult<T>(200, "ok", data);
    }

    public static <T> CommonResult<T> ok(){

        return new CommonResult<>(200, "ok", null);
    }

    public static <T> CommonResult<T> ok(String message){
        return new CommonResult<>(200, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
