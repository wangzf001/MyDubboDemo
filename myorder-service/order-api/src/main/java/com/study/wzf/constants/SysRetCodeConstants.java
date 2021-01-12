package com.study.wzf.constants;

/**
 * @author HERO
 * @date 2020/12/15
 * @project_name myuser-service
 */
public enum  SysRetCodeConstants {

    SUCCESS ("000000","成功");

    private String code;
    private String message;

    SysRetCodeConstants(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
