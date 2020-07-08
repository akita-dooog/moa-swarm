package com.akita.moa.mapper;

import com.akita.moa.model.GmsDept;
import com.akita.moa.model.GmsDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsDeptMapper {
    long countByExample(GmsDeptExample example);

    int deleteByExample(GmsDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsDept record);

    int insertSelective(GmsDept record);

    List<GmsDept> selectByExample(GmsDeptExample example);

    GmsDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsDept record, @Param("example") GmsDeptExample example);

    int updateByExample(@Param("record") GmsDept record, @Param("example") GmsDeptExample example);

    int updateByPrimaryKeySelective(GmsDept record);

    int updateByPrimaryKey(GmsDept record);
}