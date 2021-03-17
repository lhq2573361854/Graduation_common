package com.tianling.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import reactor.core.publisher.Mono;

import java.io.Serializable;

/**
 * @author TianLing
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInfo<T> implements Serializable {
    String msg;
    Integer code;
    Object data;

    public static <T> Mono<ResponseInfo<T>> ok (Mono<T> monoBody) {
        return responseBodyCreate(monoBody,0,null);
    }


    public static <T> Mono<ResponseInfo<T>> ok (Mono<T> monoBody, int code, String msg) {
        return responseBodyCreate(monoBody,code,msg);
    }

    public static <T> Mono<ResponseInfo<T>> failed (Mono<T> monoBody, int code, String msg) {
        return responseBodyCreate(monoBody,code,msg);
    }

    private static <T> Mono<ResponseInfo<T>> responseBodyCreate(Mono<T> monoData, int code, String msg) {
        return monoData.map(data-> {
            final ResponseInfo<T> responseInfo = new ResponseInfo<>();
            responseInfo.setCode(code);
            responseInfo.setData(data);
            responseInfo.setMsg(msg);
            return responseInfo;
        });
    }


}