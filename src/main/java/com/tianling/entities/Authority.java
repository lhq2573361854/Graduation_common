package com.tianling.entities;

import com.tianling.validator.authority.AuthorityAddValidator;
import com.tianling.validator.authority.AuthorityUpdateValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 用户所有的权限表
 * </p>
 *
 * @author Tian Ling
 * @since 2021-01-13
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class Authority{

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    @Id
    @NotNull(message = "唯一标识不能为空",groups = {AuthorityUpdateValidator.class})
    private Integer id;

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空",groups = {AuthorityUpdateValidator.class})
    private Integer userId;

    /**
     * 用户所有权限
     */
    @NotNull(message = "权限不能为空",groups = {AuthorityAddValidator.class, AuthorityUpdateValidator.class})
    private String userAuthority;


}
