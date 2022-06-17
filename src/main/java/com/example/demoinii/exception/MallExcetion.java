package com.example.demoinii.exception;

public class MallExcetion extends  RuntimeException {
private Integer status;
private  String msg;
public MallExcetion(Integer status, String msg)
{
    super(msg);
    this.msg=msg;
    this.status=status;
}
public MallExcetion(MallExcptionEum excptionEum)
{
    this(excptionEum.getStatus(),excptionEum.getMsg());
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
}
