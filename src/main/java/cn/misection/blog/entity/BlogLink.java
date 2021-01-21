package cn.misection.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogLink
 * @Description TODO
 * @createTime 2021年01月21日 20:50:00
 */
public class BlogLink
{
    /**
     * 链接id;
     */
    private Integer linkId;

    /**
     * link的类型;
     */
    private Byte linkType;

    /**
     * link的名字;
     */
    private String linkName;

    /**
     * 链接描述;
     */
    private String linkDescription;

    /**
     * 链接级别;
     */
    private Integer linkRank;

    /**
     * 是否被删除;
     */
    private Byte isDeleted;

    /**
     * 创建时间;
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;


    public Integer getLinkId()
    {
        return linkId;
    }

    public void setLinkId(Integer linkId)
    {
        this.linkId = linkId;
    }

    public Byte getLinkType()
    {
        return linkType;
    }

    public void setLinkType(Byte linkType)
    {
        this.linkType = linkType;
    }

    public String getLinkName()
    {
        return linkName;
    }

    public void setLinkName(String linkName)
    {
        this.linkName = linkName;
    }

    public String getLinkDescription()
    {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription)
    {
        this.linkDescription = linkDescription;
    }

    public Integer getLinkRank()
    {
        return linkRank;
    }

    public void setLinkRank(Integer linkRank)
    {
        this.linkRank = linkRank;
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
        return "BlogLink{" +
                "linkId=" + linkId +
                ", linkType=" + linkType +
                ", linkName='" + linkName + '\'' +
                ", linkDescription='" + linkDescription + '\'' +
                ", linkRank=" + linkRank +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }
}
