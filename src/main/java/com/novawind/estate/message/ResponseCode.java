package com.novawind.estate.message;

/**
 * 响应码枚举
 * @author Jeremy Xiong<br>
 * 2018-06-27 09:28
 */
public enum ResponseCode {

    //200 请求成功
    USER_DISABLED("200", "1001", "用户已被禁用"),
    BAD_USERNAME_OR_PASSWORD("200", "1002", "用户名或密码错误"),
    DUPLICATED_USERNAME("200", "1003", "用户名已存在"),
    USER_NOT_EXISTS("200", "1004", "用户不存在"),
    DUPLICATED_CUSTOMERNAME("200", "1005", "客户已存在"),
    
    SUCCESS("200", "2000", "成功"),
    FAILED("200", "2001", "失败"),
    QUERY_NO_DATA("200", "2002", "未查询到数据"),
    DUPLICATED_OPERATION("200", "2003", "重复操作"),
    ARGS_FAILED("200", "2004", "必要参数填写不正确"),

    DUPLICATED_FILENAME("200", "3001", "文件名重复"),
    FILE_MD5_CHECK_FAILED("200", "3002", "文件完整性校验失败"),
	DUPLICATED_PROJECTNAME("300", "3003", "项目名称重复"),

    //400
    SESSION_TIMEOUT("400", "9000", "未登录或登录超时"),
    INVALID_TOKEN("400", "9001", "授权认证失败"),
    PARAMS_CONVERT_ERROR("400", "9002", "请求参数转换错误"),
    NO_ACCESS("400", "9003", "无访问权限"),
    EMPTY_HEADER("400", "9004", "请求头不能为空"),
    PARAMS_CHECK_ERROR("400", "9005", "参数校验错误"),

    //500
    SYSTEM_EXCEPTION("500", "9101", "系统异常");


    private String code;
    private String status;
    private String desc;

    ResponseCode(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    ResponseCode(String code, String status, String desc) {
        this.code = code;
        this.status = status;
        this.desc = desc;
    }

    public String getCode () {
        return code;
    }
    public void setCode (String code) {
        this.code = code;
    }
    public String getStatus () {
        return status;
    }
    public void setStatus (String status) {
        this.status = status;
    }
    public String getDesc () {
        return desc;
    }
    public void setDesc (String desc) {
        this.desc = desc;
    }
}
