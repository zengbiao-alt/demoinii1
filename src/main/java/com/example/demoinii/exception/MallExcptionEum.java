package com.example.demoinii.exception;

/**
 * 自定义异常枚举
 */
public enum MallExcptionEum {
    NEED_USERNAME(10001,"用户名不能为空"),
    NEED_USEID(10019,"电话号码不能为空"),
    NEED_PASSWORD(10002,"密码不能为空"),
    NEED_PASSWORD_LENGTH(10003,"密码长度不能小于6"),
    NAME_EXISTS(1004,"名字已存在"),
    INSERT_FAILED(1005,"添加失败"),
    LOGIN_FAILED(1006,"登录失败"),
    NEED_LOGIN(1007,"需要登录"),
    UPDATE_FAILED(1008,"更新失败"),
    NEED_ADMIN(1009,"身份不匹配"),
    PARAM_ERROR(10010,"参数信息异常"),
    NOT_PARAMETER_ERROR(10010,"参数异常"),
    NOT_EXISTS(10011,"不存在"),
    DELETE_FAILED(10012,"删除错误"),
    NEED_STOCK(10013,"库存不足"),
    NOT_SELL_STATUS(10013,"不可售卖的状态"),
    DIR_EXISTS(10014,"访问的目录不存在"),
    SYSTEM_REQUEST_PARAMETER(20000,"请求参数错误"),
    CART_IS_EMPTY(10015,"购物车没有选择商品"),
    ORDER_NOT_EXISTS(10016,"订单不存在"),
    ORDER_NOT_YOUR(10017,"越权"),
    ORDER_WRONG_STAYUS(10018,"订单状态不符合"),
    SYSTEM_ERROR(20000,"系统异常"),
    USEID_NOT_EXIST(10019,"用户手机电话号码未注册"),
    REGIST_PHONE(10020,"用户手机号码已注册"),
    ORDER_EXIST(10021,"订单信息已存在"),
    UPDATE_FAIL(10022,"更新的失败");
    ;

    MallExcptionEum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
    private Integer status;
    private String msg;

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
