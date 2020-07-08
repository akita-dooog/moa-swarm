package com.akita.moa.mapper;

import com.akita.moa.model.DmsRoleWeappRelation;
import com.akita.moa.model.DmsRoleWeappRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsRoleWeappRelationMapper {
    long countByExample(DmsRoleWeappRelationExample example);

    int deleteByExample(DmsRoleWeappRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsRoleWeappRelation record);

    int insertSelective(DmsRoleWeappRelation record);

    List<DmsRoleWeappRelation> selectByExample(DmsRoleWeappRelationExample example);

    DmsRoleWeappRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsRoleWeappRelation record, @Param("example") DmsRoleWeappRelationExample example);

    int updateByExample(@Param("record") DmsRoleWeappRelation record, @Param("example") DmsRoleWeappRelationExample example);

    int updateByPrimaryKeySelective(DmsRoleWeappRelation record);

    int updateByPrimaryKey(DmsRoleWeappRelation record);
}