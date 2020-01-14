package com.example.demo.core.ret;

/**
 * 返回对象实体
 */
public class ResResult<T> {
    public int code;
    private String msg;
    private T data;
    public ResResult<T> setCode(ResCode resCode){
        this.code=resCode.code;
        return this;
    }
    public int getCode(){
        return code;
    }
    public ResResult<T> setCode(int code) {
        this.code = code;
        return this;
    }
    public String getMsg() {
        return msg;
    }
    public ResResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public T getData() {
        return data;
    }
    public ResResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
