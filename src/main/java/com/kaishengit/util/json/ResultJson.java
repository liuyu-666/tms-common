package com.kaishengit.util.json;

/**
 * 向前端返回Json数据时使用
 * @author liuyu
 * @date 2017/11/8
 */
public class ResultJson {

    private String state;
    private String message;
    private Object data;

    public static final String STATE_SUCCESS = "success";
    public static final String STATE_ERROR = "error";

    public ResultJson(){}

    public ResultJson(String state) {
        this.state = state;
    }

    public ResultJson(String state, Object data) {
        this.state = state;
        this.data = data;
    }

    public ResultJson(String state, String message) {
        this.state = state;
        this.message = message;
    }

    public static ResultJson success() {
        return new ResultJson(STATE_SUCCESS);
    }
    public static ResultJson success(Object obj) {
        return new ResultJson(STATE_SUCCESS,obj);
    }
    public static ResultJson error(String message) {
        return new ResultJson(STATE_ERROR,message);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
