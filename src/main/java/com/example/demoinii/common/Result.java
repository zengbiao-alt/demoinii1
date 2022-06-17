package com.example.demoinii.common;

import com.example.demoinii.exception.MallExcptionEum;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 统一的响应结果封装
 */
public class Result<T> {
    private Integer status;
    private String msg;
    private T data;
    //响应正常状态码
    private static final Integer OK_CODE = 10000;
    //响应正常信息
    private static final String OK_MSG = "SUCCESS";

    public Result(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    public Result(){
        this(OK_CODE,OK_MSG);
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result();
        result.setData(data);
        return  result;
    }
    public static Result success(){
        Result result = new Result();
        return  result;
    }
    public static Result error(Integer status ,String msg){
        Result result = new Result(status, msg);
        return result;
    }
    public static Result error(MallExcptionEum exceptionEnum){
        Result result = new Result(exceptionEnum.getStatus(),exceptionEnum.getMsg());
        return result;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        //String haha = objectMapper.writeValueAsString(Result.success("haha"));
        //String haha = objectMapper.writeValueAsString(Result.success());
        String haha = objectMapper.writeValueAsString(Result.error(MallExcptionEum.SYSTEM_ERROR));

        System.out.println(haha);
    }
}
