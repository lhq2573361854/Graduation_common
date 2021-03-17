package com.tianling.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Tianling
 * @email 859073143@qq.com
 * @since 2021/3/1 18:59
 */
@Data
@AllArgsConstructor
public class ErrorMessage implements Serializable {
    String cause;
}
