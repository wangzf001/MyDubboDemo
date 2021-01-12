package com.study.wzf.mydubboorder.commons;

/**
 * @author HERO
 * @date 2020/12/23
 * @project_name myorder-service
 */
public class ResponseData<T> {
    private boolean success;
    private String message;
    private int code;
    private T result;
    private long timestamp = System.currentTimeMillis();

    public ResponseData() {
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
