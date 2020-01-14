package com.example.demo.core.ret;

public class ResResponse {
    private final static String SUCCESS="success";

    public static <T> ResResult<T> makeOkRsp(T data){
        return new ResResult<T>().setCode(ResCode.SUCCESS).setMsg(SUCCESS);
    }
    public static <T> ResResult<T> makeOKRsp(T data) {
        return new ResResult<T>().setCode(ResCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }
    public static <T> ResResult<T> makeErrRsp(String message) {
        return new ResResult<T>().setCode(ResCode.FAIL).setMsg(SUCCESS);
    }
    public static <T> ResResult<T> makeRsp(int code, String msg) {
        return new ResResult<T>().setCode(code).setMsg(msg);
    }
    public static <T> ResResult<T> makeRsp(int code, String msg, T data) {
        return new ResResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
