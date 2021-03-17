package com.tianling.entities;

import com.tianling.validator.role.RoleAddValidator;
import com.tianling.validator.role.RoleUpdateValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 用户的角色表
 * </p>
 *
 * @author Tian Ling
 * @since 2021-01-13
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class Role {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    @Id
    @NotNull(message = "唯一标识不能为空",groups = {RoleUpdateValidator.class})
    private Integer id;

    /**
     * 用户id
     */
    @NotNull(message = " 用户id不能为空",groups = {RoleAddValidator.class})
    private Integer userId;

    /**
     * 用户所属角色
     */
    @NotNull(message = "角色不能为空",groups = {RoleUpdateValidator.class,RoleAddValidator.class})
    private String userRole;


}
