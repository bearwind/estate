package com.novawind.estate.message;


import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 响应信息
 * @author Jeremy Xiong<br>
 * 2018-06-27 09:30
 */
public class ResponseMessage {

    private String code;
    private String status;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public ResponseMessage(ResponseCode responseCode, String message){
        this(responseCode);
        this.message = message;
    }

    public ResponseMessage(ResponseCode responseCode){
        this.code = responseCode.getCode();
        this.status = responseCode.getStatus();
        this.message = responseCode.getDesc();
    }

    public ResponseMessage(ResponseCode responseCode, Object data){
        this(responseCode);
        this.data = data;
    }

    public ResponseMessage(ResponseCode code, String message, Object data){
        this(code, message);
        this.data = data;
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
    public String getMessage () {
        return message;
    }
    public void setMessage (String message) {
        this.message = message;
    }
    public Object getData () {
        return data;
    }
    public void setData (Object data) {
        this.data = data;
    }

    public void setResponseCode(ResponseCode responseCode, boolean setMsgAsCodeDefaultDesc) {
        this.status = responseCode.getStatus();
        this.code = responseCode.getCode();
        if(setMsgAsCodeDefaultDesc) {
            this.message = responseCode.getDesc();
        }
    }

}
