package cn.misection.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogTag
 * @Description TODO
 * @createTime 2021年01月21日 20:54:00
 */
public class BlogTag
{
    /**
     * 标签 id;
     */
    private Integer tagID;

    /**
     * 标签名;
     */
    private String tagName;

    /**
     * 是否被删除;
     */
    private Byte isDeleted;

    /**
     * 创建日期;
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public Integer getTagID()
    {
        return tagID;
    }

    public void setTagID(Integer tagID)
    {
        this.tagID = tagID;
    }

    public String getTagName()
    {
        return tagName;
    }

    public void setTagName(String tagName)
    {
        this.tagName = tagName;
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


    @Override
    public String toString()
    {
        return "BlogTag{" +
                "tagID=" + tagID +
                ", tagName='" + tagName + '\'' +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }
}
