package cn.misection.blog.entity;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogTagRelation
 * @Description TODO
 * @createTime 2021年01月21日 21:12:00
 */
public class BlogTagRelation
{
    private Long relationId;

    private Long blogId;

    private Integer tagId;

    private Date createTime;

    public Long getRelationId()
    {
        return relationId;
    }

    public void setRelationId(Long relationId)
    {
        this.relationId = relationId;
    }

    public Long getBlogId()
    {
        return blogId;
    }

    public void setBlogId(Long blogId)
    {
        this.blogId = blogId;
    }

    public Integer getTagId()
    {
        return tagId;
    }

    public void setTagId(Integer tagId)
    {
        this.tagId = tagId;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }


    @Override
    public String toString()
    {
        return "BlogTagRelation{" +
                "relationId=" + relationId +
                ", blogId=" + blogId +
                ", tagId=" + tagId +
                ", createTime=" + createTime +
                '}';
    }
}
