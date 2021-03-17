package com.tianling.entities;


import com.tianling.validator.category.CategoryAddValidator;
import com.tianling.validator.category.CategoryUpdateCategoryIdValidator;
import com.tianling.validator.category.CategoryUpdateCategoryNameValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 * 栏目信息
 * </p>
 *
 * @author Tian Ling
 * @since 2021-02-08
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 栏目的唯一id
     */
    @Id
    @NotNull(message = "唯一标识不能为空",groups = {CategoryUpdateCategoryIdValidator.class})
    private Integer id;

    /**
     * 栏目名
     */
    @NotNull(message = "栏目名不能为空",groups = {CategoryUpdateCategoryNameValidator.class, CategoryAddValidator.class})
    private String categoryName;

    /**
     * 栏目别名
     */
    private String categoryAlias;

    /**
     * 栏目描述
     */
    private String categoryDesc;


}
