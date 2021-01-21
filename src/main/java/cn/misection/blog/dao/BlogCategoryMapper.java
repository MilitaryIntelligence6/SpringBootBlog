package cn.misection.blog.dao;

import cn.misection.blog.entity.BlogCategory;
import cn.misection.blog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName BlogCategoryMapper
 * @Description TODO
 * @createTime 2021年01月21日 21:22:00
 */
public interface BlogCategoryMapper
{
    int deleteByPrimaryKey(Integer categoryId);

    int insert(BlogCategory record);

    int insertSelective(BlogCategory record);

    BlogCategory selectByPrimaryKey(Integer categoryId);

    BlogCategory selectByCategoryName(String categoryName);

    int updateByPrimaryKeySelective(BlogCategory record);

    int updateByPrimaryKey(BlogCategory record);

    List<BlogCategory> findCategoryList(PageQueryUtil pageUtil);

    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);

    int getTotalCategories(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);

}
