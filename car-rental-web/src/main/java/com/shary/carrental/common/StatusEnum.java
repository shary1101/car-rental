package com.shary.carrental.common;

/**
 * Http status code enum
 *
 * @author shary
 *
 */
public enum StatusEnum {
    SUCCESS(200), FAIL(400), INTERNAL_SERVER_ERROR(500);

    private int code;
    StatusEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
