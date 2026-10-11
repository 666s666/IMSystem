package com.yes666.im.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 后端统一返回数据
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {
    String msg;
    Integer code; //1:success
    T data;
    public static <T>  Result<T> success(){
        Result<T> result = new Result<>();
        result.setCode(1);
        return result;
    }
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(1);
        result.setData(data);
        return result;
    }
    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMsg(msg );
        return result;
    }
}
