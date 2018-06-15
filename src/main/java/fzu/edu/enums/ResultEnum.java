package fzu.edu.enums;

/**
 * 反馈结果枚举，统一管理反馈结果的状态码
 */
public enum ResultEnum {
    SUCCESS(0,"成功"),
    UN_KNOW_ERROR(-1,"未知错误"),
    FORMAT_ERROR(100,"格式不符合要求"),
    DUPLICATE_ID(101,"该账号已被注册"),
    LOGIN_ERROR(102,"账号或密码错误"),
    ;

    private int code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
