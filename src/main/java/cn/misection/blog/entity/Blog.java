package cn.misection.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName Blog
 * @Description TODO
 * @createTime 2021年01月21日 13:21:00
 */
public class Blog
{
    /**
     * blog id;
     */
    private Long blogId;

    /**
     * blog 标题;
     */
    private String blogTitle;

    /**
     * 子链接;
     */
    private String blogSubUrl;

    /**
     * 封面图片;
     */
    private String blogCoverImage;

    /**
     * 该blog类别id;
     */
    private Integer blogCategoryId;

    /**
     * blog类别名;
     */
    private String blogCategoryName;

    /**
     * blog标签;
     */
    private String blogTags;

    /**
     * blog 状态;
     */
    private Byte blogStatus;

    /**
     * blog 视图;
     */
    private Long blogViews;

    /**
     * 能否评论;
     */
    private Byte enableComment;

    /**
     * 是否被删;
     */
    private Byte isDeleted;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private Date updateTime;

    private String blogContent;

    public Long getBlogId()
    {
        return blogId;
    }

    public void setBlogId(Long blogId)
    {
        this.blogId = blogId;
    }

    public String getBlogTitle()
    {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle)
    {
        this.blogTitle = blogTitle;
    }

    public String getBlogSubUrl()
    {
        return blogSubUrl;
    }

    public void setBlogSubUrl(String blogSubUrl)
    {
        this.blogSubUrl = blogSubUrl;
    }

    public String getBlogCoverImage()
    {
        return blogCoverImage;
    }

    public void setBlogCoverImage(String blogCoverImage)
    {
        this.blogCoverImage = blogCoverImage;
    }

    public Integer getBlogCategoryId()
    {
        return blogCategoryId;
    }

    public void setBlogCategoryId(Integer blogCategoryId)
    {
        this.blogCategoryId = blogCategoryId;
    }

    public String getBlogCategoryName()
    {
        return blogCategoryName;
    }

    public void setBlogCategoryName(String blogCategoryName)
    {
        this.blogCategoryName = blogCategoryName;
    }

    public String getBlogTags()
    {
        return blogTags;
    }

    public void setBlogTags(String blogTags)
    {
        this.blogTags = blogTags;
    }

    public Byte getBlogStatus()
    {
        return blogStatus;
    }

    public void setBlogStatus(Byte blogStatus)
    {
        this.blogStatus = blogStatus;
    }

    public Long getBlogViews()
    {
        return blogViews;
    }

    public void setBlogViews(Long blogViews)
    {
        this.blogViews = blogViews;
    }

    public Byte getEnableComment()
    {
        return enableComment;
    }

    public void setEnableComment(Byte enableComment)
    {
        this.enableComment = enableComment;
    }

    public Byte getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted)
    {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getBlogContent()
    {
        return blogContent;
    }

    public void setBlogContent(String blogContent)
    {
        this.blogContent = blogContent;
    }


    @Override
    public String toString()
    {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogSubUrl='" + blogSubUrl + '\'' +
                ", blogCoverImage='" + blogCoverImage + '\'' +
                ", blogCategoryId=" + blogCategoryId +
                ", blogCategoryName='" + blogCategoryName + '\'' +
                ", blogTags='" + blogTags + '\'' +
                ", blogStatus=" + blogStatus +
                ", blogViews=" + blogViews +
                ", enableComment=" + enableComment +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", blogContent='" + blogContent + '\'' +
                '}';
    }
}
