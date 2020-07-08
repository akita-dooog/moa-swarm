package com.akita.moa.mapper;

import com.akita.moa.model.ImsGroup;
import com.akita.moa.model.ImsGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsGroupMapper {
    long countByExample(ImsGroupExample example);

    int deleteByExample(ImsGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImsGroup record);

    int insertSelective(ImsGroup record);

    List<ImsGroup> selectByExample(ImsGroupExample example);

    ImsGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImsGroup record, @Param("example") ImsGroupExample example);

    int updateByExample(@Param("record") ImsGroup record, @Param("example") ImsGroupExample example);

    int updateByPrimaryKeySelective(ImsGroup record);

    int updateByPrimaryKey(ImsGroup record);
}