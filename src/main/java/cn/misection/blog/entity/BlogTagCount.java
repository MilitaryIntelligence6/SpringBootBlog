package cn.misection.blog.entity;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogTagCount
 * @Description TODO
 * @createTime 2021年01月21日 20:58:00
 */
public class BlogTagCount
{
    /**
     * 标签 id;
     */
    private Integer tagId;

    /**
     * 标签名;
     */
    private String tagName;

    /**
     * 标签个数;
     */
    private Integer tagCount;


    public Integer getTagId()
    {
        return tagId;
    }

    public void setTagId(Integer tagId)
    {
        this.tagId = tagId;
    }

    public String getTagName()
    {
        return tagName;
    }

    public void setTagName(String tagName)
    {
        this.tagName = tagName;
    }

    public Integer getTagCount()
    {
        return tagCount;
    }

    public void setTagCount(Integer tagCount)
    {
        this.tagCount = tagCount;
    }

    @Override
    public String toString()
    {
        return "BlogTagCount{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", tagCount=" + tagCount +
                '}';
    }
}
