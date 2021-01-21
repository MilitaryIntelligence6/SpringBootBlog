package cn.misection.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogCategory
 * @Description blog 类别;
 * @createTime 2021年01月21日 15:51:00
 */
public class BlogCategory
{
    /**
     * 类别id;
     */
    private Integer categoryId;

    /**
     * 类别名称;
     */
    private String categoryName;

    /**
     * 类别icon;
     */
    private String categoryIcon;

    /**
     * 类别级别;
     */
    private Integer categoryRank;

    /**
     * 是否被删;
     */
    private Byte isDeleted;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public Integer getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryIcon()
    {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon)
    {
        this.categoryIcon = categoryIcon;
    }

    public Integer getCategoryRank()
    {
        return categoryRank;
    }

    public void setCategoryRank(Integer categoryRank)
    {
        this.categoryRank = categoryRank;
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
}
