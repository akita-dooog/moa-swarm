package com.akita.moa.mapper;

import com.akita.moa.model.GmsRolePremitRelation;
import com.akita.moa.model.GmsRolePremitRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsRolePremitRelationMapper {
    long countByExample(GmsRolePremitRelationExample example);

    int deleteByExample(GmsRolePremitRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsRolePremitRelation record);

    int insertSelective(GmsRolePremitRelation record);

    List<GmsRolePremitRelation> selectByExample(GmsRolePremitRelationExample example);

    GmsRolePremitRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsRolePremitRelation record, @Param("example") GmsRolePremitRelationExample example);

    int updateByExample(@Param("record") GmsRolePremitRelation record, @Param("example") GmsRolePremitRelationExample example);

    int updateByPrimaryKeySelective(GmsRolePremitRelation record);

    int updateByPrimaryKey(GmsRolePremitRelation record);
}