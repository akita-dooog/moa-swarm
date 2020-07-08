package com.akita.moa.mapper;

import com.akita.moa.model.GmsUserRoleRelation;
import com.akita.moa.model.GmsUserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsUserRoleRelationMapper {
    long countByExample(GmsUserRoleRelationExample example);

    int deleteByExample(GmsUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsUserRoleRelation record);

    int insertSelective(GmsUserRoleRelation record);

    List<GmsUserRoleRelation> selectByExample(GmsUserRoleRelationExample example);

    GmsUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsUserRoleRelation record, @Param("example") GmsUserRoleRelationExample example);

    int updateByExample(@Param("record") GmsUserRoleRelation record, @Param("example") GmsUserRoleRelationExample example);

    int updateByPrimaryKeySelective(GmsUserRoleRelation record);

    int updateByPrimaryKey(GmsUserRoleRelation record);
}