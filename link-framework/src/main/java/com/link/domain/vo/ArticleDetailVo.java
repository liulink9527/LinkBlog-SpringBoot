package com.link.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Link
 * @Description
 * @date 2022-12-29 13:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDetailVo {

    private Long id;
    //标题
    private String title;
    //文章内容
    private String content;

    //分类id
    private Long categoryId;

    private String categoryName;

    private Date createTime;
    //访问量
    private Long viewCount;
    //是否允许评论 1是，0否
    private String isComment;


}
