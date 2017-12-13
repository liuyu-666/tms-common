package com.kaishengit.exception;

/**
 * 访问404异常
 * @author liuyu
 * @date 2017/11/10
 */
public class NotFindException extends RuntimeException {
    public NotFindException(){}

    public NotFindException(String message) {
        super(message);
    }

    public NotFindException(Throwable th) {
        super(th);
    }

    public NotFindException(Throwable th, String message) {
        super(message,th);
    }

}
