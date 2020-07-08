package com.akita.moa.mapper;

import com.akita.moa.model.DmsWeappCategory;
import com.akita.moa.model.DmsWeappCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsWeappCategoryMapper {
    long countByExample(DmsWeappCategoryExample example);

    int deleteByExample(DmsWeappCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DmsWeappCategory record);

    int insertSelective(DmsWeappCategory record);

    List<DmsWeappCategory> selectByExample(DmsWeappCategoryExample example);

    DmsWeappCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DmsWeappCategory record, @Param("example") DmsWeappCategoryExample example);

    int updateByExample(@Param("record") DmsWeappCategory record, @Param("example") DmsWeappCategoryExample example);

    int updateByPrimaryKeySelective(DmsWeappCategory record);

    int updateByPrimaryKey(DmsWeappCategory record);
}