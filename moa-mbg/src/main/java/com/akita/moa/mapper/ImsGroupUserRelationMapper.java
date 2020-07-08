package com.akita.moa.mapper;

import com.akita.moa.model.ImsGroupUserRelation;
import com.akita.moa.model.ImsGroupUserRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsGroupUserRelationMapper {
    long countByExample(ImsGroupUserRelationExample example);

    int deleteByExample(ImsGroupUserRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImsGroupUserRelation record);

    int insertSelective(ImsGroupUserRelation record);

    List<ImsGroupUserRelation> selectByExample(ImsGroupUserRelationExample example);

    ImsGroupUserRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImsGroupUserRelation record, @Param("example") ImsGroupUserRelationExample example);

    int updateByExample(@Param("record") ImsGroupUserRelation record, @Param("example") ImsGroupUserRelationExample example);

    int updateByPrimaryKeySelective(ImsGroupUserRelation record);

    int updateByPrimaryKey(ImsGroupUserRelation record);
}