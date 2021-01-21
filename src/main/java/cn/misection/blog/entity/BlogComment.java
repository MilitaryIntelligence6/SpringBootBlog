package cn.misection.blog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogComment
 * @Description TODO
 * @createTime 2021年01月21日 15:55:00
 */
public class BlogComment
{
    /**
     * 评论id;
     */
    private Long commentId;

    /**
     * 父blog id;
     */
    private Long blogId;

    /**
     * 发评论者;
     */
    private String commentator;

    /**
     * 发评论者 email;
     */
    private String email;

    /**
     * 发评论者url;
     */
    private String websiteUrl;

    /**
     * 评论体;
     */
    private String commentBody;

    /**
     * 评论创建时间;
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commentCreateTime;

    /**
     * 发评论者 ip;
     */
    private String commentatorIp;

    /**
     * admin 回复体;
     */
    private String replyBody;

    /**
     * 回复创建时间;
     */
    private Date replyCreateTime;

    /**
     * 评论状态;
     */
    private Byte  commentStatus;

    /**
     * 评论是否被删除;
     */
    private Byte isDeleted;

    public Long getCommentId()
    {
        return commentId;
    }

    public void setCommentId(Long commentId)
    {
        this.commentId = commentId;
    }

    public Long getBlogId()
    {
        return blogId;
    }

    public void setBlogId(Long blogId)
    {
        this.blogId = blogId;
    }

    public String getCommentator()
    {
        return commentator;
    }

    public void setCommentator(String commentator)
    {
        this.commentator = commentator;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getWebsiteUrl()
    {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl)
    {
        this.websiteUrl = websiteUrl;
    }

    public String getCommentBody()
    {
        return commentBody;
    }

    public void setCommentBody(String commentBody)
    {
        this.commentBody = commentBody;
    }

    public Date getCommentCreateTime()
    {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Date commentCreateTime)
    {
        this.commentCreateTime = commentCreateTime;
    }

    public String getCommentatorIp()
    {
        return commentatorIp;
    }

    public void setCommentatorIp(String commentatorIp)
    {
        this.commentatorIp = commentatorIp;
    }

    public String getReplyBody()
    {
        return replyBody;
    }

    public void setReplyBody(String replyBody)
    {
        this.replyBody = replyBody;
    }

    public Date getReplyCreateTime()
    {
        return replyCreateTime;
    }

    public void setReplyCreateTime(Date replyCreateTime)
    {
        this.replyCreateTime = replyCreateTime;
    }

    public Byte getCommentStatus()
    {
        return commentStatus;
    }

    public void setCommentStatus(Byte commentStatus)
    {
        this.commentStatus = commentStatus;
    }

    public Byte getIsDeleted()
    {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted)
    {
        this.isDeleted = isDeleted;
    }


    @Override
    public String toString()
    {
        return "BlogComment{" +
                "commentId=" + commentId +
                ", blogId=" + blogId +
                ", commentator='" + commentator + '\'' +
                ", email='" + email + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", commentBody='" + commentBody + '\'' +
                ", commentCreateTime=" + commentCreateTime +
                ", commentatorIp='" + commentatorIp + '\'' +
                ", replyBody='" + replyBody + '\'' +
                ", replyCreateTime=" + replyCreateTime +
                ", commentStatus=" + commentStatus +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
