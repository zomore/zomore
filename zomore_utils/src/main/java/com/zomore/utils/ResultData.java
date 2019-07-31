package com.zomore.utils;

public class ResultData <T>{
    private String data;

    private int code =200;

    private String msg;

    private Boolean success = true;
    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCode() {

        return code;
    }
    public void setCode(int code) {
        if(200 != code){
            success = false;
        }
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
