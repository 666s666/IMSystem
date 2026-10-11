package com.yes666.im.exception;

public class BaseException extends RuntimeException {
    private final int httpStatus;
    public BaseException(String message) {
        super(message);
    }
    public BaseException(int HttpStatus,String msg){ super(msg); this.httpStatus = HttpStatus;}
    public int getHttpStatus(){ return this.httpStatus;}
}
