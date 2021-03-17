package com.tianling.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tianling.validator.user.UserAddValidator;
import com.tianling.validator.user.UserUpdateByIdValidator;
import com.tianling.validator.user.UserUpdateByUserNameValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

/**
 * <p>
 *  用户表
 * </p>
 *
 * @author Tian Ling
 * @since 2021-01-13
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class User{

    private static final long serialVersionUID = 1L;

    /**
     * 唯一表标识
     */
    @Id
    @NotNull(message = "唯一标不能为空",groups = {UserUpdateByIdValidator.class})
    private Integer id;

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空",groups = {UserAddValidator.class, UserUpdateByUserNameValidator.class})
    private String userName;

    /**
     * 用户密码
     */
    @NotNull(message = "密码不能为空",groups = {UserAddValidator.class})
    private String userPass;

    /**
     * 注册时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerTime;

    /**
     * 最近一次登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime recentlyTime;

    /**
     * 之前登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime previousTime;

    /**
     * 用户邮箱
     */
    @NotNull(message = "email不能为空",groups = {UserAddValidator.class})
    @Email(message = "email不正确",groups = {UserAddValidator.class})
    private String userEmail;

    /**
     * 用户手机号
     */
    @NotNull(message = "手机号码不能为空",groups = {UserAddValidator.class})
    @Pattern(regexp ="^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "手机号格式有误",groups = {UserAddValidator.class})
    private String userPhone;

    /**
     * 用户性别
     */
    @NotNull(message = "性别不能为空",groups = {UserAddValidator.class})
    private String userSex;

    /**
     * 用户国家
     */
    @NotNull(message = "国家不能为空",groups = {UserAddValidator.class})
    private String userCountry;

    /**
     * 用户所在省
     */
    @NotNull(message = "省不能为空",groups = {UserAddValidator.class})
    private String userProvince;

    /**
     * 用户城市
     */
    @NotNull(message = "市不能为空",groups = {UserAddValidator.class})
    private String userCity;

    /**
     * 用户所在区县
     */
    @NotNull(message = "区县不能为空",groups = {UserAddValidator.class})
    private String userDistrict;


}
