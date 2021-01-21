package cn.misection.blog.entity;

import java.util.Date;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogConfig
 * @Description TODO
 * @createTime 2021年01月21日 20:43:00
 */
public class BlogConfig
{
    /**
     * 配置name;
     */
    private String configName;

    /**
     * 配置值;
     */
    private String configValue;

    /**
     * 创建时间;
     */
    private Date createTime;

    /**
     * 更新时间;
     */
    private Date updateTime;


    public String getConfigName()
    {
        return configName;
    }

    public void setConfigName(String configName)
    {
        this.configName = configName;
    }

    public String getConfigValue()
    {
        return configValue;
    }

    public void setConfigValue(String configValue)
    {
        this.configValue = configValue;
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


    @Override
    public String toString()
    {
        return "BlogConfig{" +
                "configName='" + configName + '\'' +
                ", configValue='" + configValue + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
