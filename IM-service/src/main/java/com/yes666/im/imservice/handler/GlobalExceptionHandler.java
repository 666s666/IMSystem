package com.yes666.im.imservice.handler;

import com.yes666.im.exception.BaseException;
import com.yes666.im.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result exceptionHandler(BaseException e){
        log.error("异常错误信息:{}",e.getMessage());
        return Result.error(e.getMessage());
    }
}
