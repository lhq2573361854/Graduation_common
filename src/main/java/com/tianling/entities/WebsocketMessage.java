package com.tianling.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/2/24 16:39
 */
@Data
public class WebsocketMessage implements Serializable {
    private Integer id;
    private Integer code;
    private Integer starNumber;
    private String uuid;
    private String category;
}