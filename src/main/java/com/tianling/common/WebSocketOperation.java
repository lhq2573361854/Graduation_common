package com.tianling.common;


/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/2/24 18:37
 */
public enum WebSocketOperation {
    /**
     * 增加
     */
    ADD(1),
    /**
     * 减少
     */
    SUP(2),
    /**
     * 错误
     */
    ERROR(3),
    /**
     * 成功
     */
    SUCCESS(4);
    private Integer value;
    WebSocketOperation(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
