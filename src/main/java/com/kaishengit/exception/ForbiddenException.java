package com.kaishengit.exception;

/**
 * 权限异常
 * @author liuyu
 */
public class ForbiddenException extends RuntimeException {
    public ForbiddenException(){}

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(Throwable th) {
        super(th);
    }

    public ForbiddenException(Throwable th, String message) {
        super(message,th);
    }

}
