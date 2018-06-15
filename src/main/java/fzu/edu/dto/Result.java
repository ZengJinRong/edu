package fzu.edu.dto;


import fzu.edu.enums.ResultEnum;

/**
 * 反馈结果类，用于服务器端与安卓端的消息通信
 */
public class Result<T>{
    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setResultEnum(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message=resultEnum.getMessage();
    }

    public void setData(T data) {
        this.data = data;
    }
}
