package com.tianling.common;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/1/24 21:01
 */
public enum CacheName {
    /**
     * 唯一表示缓存名
     */
    ID("id_"),
    /**
     * 用户名 缓存名
     */
    USERNAME("username_"),
    /**
     * user id缓存名
     */
    USERID("userid_");


    private String name;

    CacheName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
