package com.tianling.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tianling.validator.comment.CommentAddValidator;
import com.tianling.validator.comment.CommentUpdateValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户评论表
 * </p>
 *
 * @author Tian Ling
 * @since 2021-01-13
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class Comment {

    private static final long serialVersionUID = 1L;

    /**
     * 评论的唯一标识
     */
    @Id
    @NotNull(message = "唯一标识不能为空",groups = {CommentUpdateValidator.class})
    private Integer id;

    /**
     * 评论内容
     */
    @NotNull(message = "评论内容不能为空",groups = {CommentAddValidator.class,CommentUpdateValidator.class})
    private String commentContent;

    /**
     * 评论的用户
     */
    @NotNull(message = "评论的用户id不能为空",groups = {CommentAddValidator.class})
    private Integer commentUserId;

    /**
     * 评论的时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime commentTime;

    /**
     * 被评论的用户
     */
    @NotNull(message = "被评论的用户id不能为空",groups = {CommentAddValidator.class})
    private Integer commentOtherId;

    /**
     * 被点赞的次数
     */
    @NotNull(message = "点赞的次数不能为空",groups = {CommentAddValidator.class})
    private Integer commentStars;

    /**
     * 被点赞的文章id
     */
    @NotNull(message = "文章id不存在",groups = {CommentAddValidator.class})
    private Integer commentArticleId;
}
