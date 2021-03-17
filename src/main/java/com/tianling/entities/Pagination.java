package com.tianling.entities;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/2/27 16:52
 */
@Data
@ToString
public class Pagination implements Serializable {
    private Integer page;
    private Integer pageShowNumber;
    private Integer total;
}
