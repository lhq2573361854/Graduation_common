package com.tianling.common;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/1/25 14:20
 */
public enum AuthenticationMessage {

    /**
     * 认证成功返回的信息
     */
    AUTHENTICATIONSUCCESS("认证成功"),
    /**
     * 认证失败返回的信息
     */
    AUTHENTICATIONFAILED("认证失败"),

    /**
     * 认证成功返回的信息
     */
    AUTHRIZATIONSUCCESS("授权成功"),
    /**
     * 认证失败返回的信息
     */
    AUTHRIZATIONFAILED("无权限访问"),
    /**
     * 认证token前缀
     */
    AUTHENTICATIONTOKENPREFIX("auth_"),
    /**
     * Bearer token字符串 前缀
     */
    AUTHENTICATIONCLINETTOKENPREFIX("Bearer"),

    /**
     * 认证token名
     */
    AUTHENTICATIONTOKEN("token"),

    ;
    private String message;

    AuthenticationMessage(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
