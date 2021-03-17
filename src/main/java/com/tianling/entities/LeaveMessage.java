package com.tianling.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tianling.validator.leave.message.LeaveMessageAddValidator;
import com.tianling.validator.leave.message.LeaveMessageUpdateValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 留言表
 * </p>
 *
 * @author Tian Ling
 * @since 2021-02-22
 */
@Data
@Table
@EqualsAndHashCode
@ToString
public class LeaveMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 留言id
     */
    @Id
    private Integer id;

    /**
     * 留言的用户
     */
    @NotNull(message = "没有留言的用户id",groups = {LeaveMessageAddValidator.class})

    private Integer userId;

    /**
     * 接受留言的用户
     */
    @NotNull(message = "没有接受留言的用户id",groups = {LeaveMessageAddValidator.class})
    private Integer acceptId;

    /**
     * 留言的时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private LocalDateTime sendTime;

    /**
     * 留言的内容
     */
    @NotNull(message = "留言的内容不能为空",groups = {LeaveMessageAddValidator.class,LeaveMessageUpdateValidator.class})
    private String message;

    /**
     * 留言的标题
     */
    @NotNull(message = "留言的标题不能为空",groups = {LeaveMessageAddValidator.class})
    private String messageTitle;

    /**
     * 留言人的邮箱
     */
    @NotNull(message = "留言的标题不能为空",groups = {LeaveMessageAddValidator.class})
    @Email(message = "邮箱不正确",groups = {LeaveMessageAddValidator.class})
    private String messageEmail;

    @NotNull(message = "留言的栏目不能为空",groups = {LeaveMessageAddValidator.class})
    private String categoryId;



}
