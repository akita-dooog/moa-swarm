package com.akita.moa.mapper;

import com.akita.moa.model.DmsWeapp;
import com.akita.moa.model.DmsWeappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsWeappMapper {
    long countByExample(DmsWeappExample example);

    int deleteByExample(DmsWeappExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsWeapp record);

    int insertSelective(DmsWeapp record);

    List<DmsWeapp> selectByExample(DmsWeappExample example);

    DmsWeapp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsWeapp record, @Param("example") DmsWeappExample example);

    int updateByExample(@Param("record") DmsWeapp record, @Param("example") DmsWeappExample example);

    int updateByPrimaryKeySelective(DmsWeapp record);

    int updateByPrimaryKey(DmsWeapp record);
}