package com.seata.instance.common.enums;

public enum CodeEnum {

//    SUCCESS("S0A000", "成功"),
//    BAD_REQUEST("E00201", "失败"),
//    BAD_NO_FOUND_REQUEST("E00400", "找不到资源"),
//    BAD_REUEST_METHOD("E00405", "请求方式错误"),
//    INTERNAL_SERVER_ERROR("E00500", "服务端错误"),
//    UNKNOWN_ERROR("E00501", "系统异常"),

    /** 通用 */
    SUCCESS("S0A000", "成功"),
    BAD_REQUEST("E00201", "失败"),
    BAD_NO_FOUND_REQUEST("E00400", "找不到资源"),
    BAD_REUEST_METHOD("E00405", "请求方式错误"),
    INTERNAL_SERVER_ERROR("E00500", "服务端错误"),
    UNKNOWN_ERROR("E00501", "系统异常"),
    SEND_SMS_ERROR("B60001", "短信发送未返回结果"),
    SEND_SMS_NO_RESPONSE("B60002", "短信发送未返回结果"),
    SEND_SMS_TEMPLATE_EMPTY("B60003", "短信模板为空"),
    JWT_PARSE_ERROR("B60004", "token解析错误"),
    MISSING_ARGUMENT("B60005", "参数缺少"),
    DATE_FORMAT_ERROR("B60006", "解析日期格式错误"),
    NETWORK_ERROR("B60007", "网络异常"),
    TOKEN_ERROR("B60004", "token无效"),
    SIGN_NOT_VALID("B60028", "签名不可用"),
    PASSWORD_ERROR("B60029", "密码不正确"),
    O2O_FILE_READ_ERROR("B60030", "O2O订单日志不存在"),
    O2O_FILE_READ_UPDATE("B60030", "O2O订单日志未更新"),
    POS_FILE_READ_ERROR("B60031", "POS订单日志不存在"),
    POS_FILE_READ_UPDATE("B60031", "POS订单日志未更新"),
    FILE_READ_ERROR("B60032", "读取文件不存在"),
    DATA_DUPLICATION("B60033", "数据重复"),

    // 自定义状态
    ;

    private String code;

    private String msg;

    CodeEnum(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public CodeEnum getCodeEnum(int code){
        return CodeEnum.valueOf("");
    }
}
