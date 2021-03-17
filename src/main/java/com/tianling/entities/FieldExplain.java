package com.tianling.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Tian Ling
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Table
public class FieldExplain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一主键 
     */
    @Id
    private Integer id;

    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 字段说明
     */
    private String fieldExplain;


}
