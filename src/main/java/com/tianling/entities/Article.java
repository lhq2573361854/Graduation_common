package com.tianling.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.tianling.validator.article.ArticleAddValidator;
import com.tianling.validator.article.ArticleUpdateValidator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 文章信息
 * </p>
 *
 * @author Tian Ling
 * @since 2021-01-13
 */
@Data
@Table
@EqualsAndHashCode
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章的唯一标识
     */
    @Id
    @NotNull(message = "唯一标识不能为空",groups = {ArticleUpdateValidator.class})
    private Integer id;

    /**
     * 关联的用户id
     */
    @NotNull(message = "关联的用户id不能为空",groups = {ArticleAddValidator.class})
    private Integer userId;

    @NotNull(message = "关联的用户id不能为空",groups = {ArticleAddValidator.class})
    private String articleTitle;

    /**
     * 文章的内容
     */
    @NotNull(message = "文章的内容不能为空",groups = {ArticleAddValidator.class})
    private String articleContent;

    /**
     * 文章的发布时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime articleDate;

    /**
     * 文章点赞次数
     */
    @NotNull(message = "文章点赞次数不能为空",groups = {ArticleUpdateValidator.class})
    private Integer articleStars;

    /**
     * 文章发布地点
     */
    @NotNull(message = "位置信息不能为空",groups = {ArticleAddValidator.class})
    private String articleAddress;
    /**
     * 栏目id
     */
    @NotNull(message = "栏目id不能为空",groups = {ArticleAddValidator.class})
    private Integer categoryId;

}
