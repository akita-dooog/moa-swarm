package com.akita.moa.mapper;

import com.akita.moa.model.DmsRoleBannerSetRelation;
import com.akita.moa.model.DmsRoleBannerSetRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsRoleBannerSetRelationMapper {
    long countByExample(DmsRoleBannerSetRelationExample example);

    int deleteByExample(DmsRoleBannerSetRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsRoleBannerSetRelation record);

    int insertSelective(DmsRoleBannerSetRelation record);

    List<DmsRoleBannerSetRelation> selectByExample(DmsRoleBannerSetRelationExample example);

    DmsRoleBannerSetRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsRoleBannerSetRelation record, @Param("example") DmsRoleBannerSetRelationExample example);

    int updateByExample(@Param("record") DmsRoleBannerSetRelation record, @Param("example") DmsRoleBannerSetRelationExample example);

    int updateByPrimaryKeySelective(DmsRoleBannerSetRelation record);

    int updateByPrimaryKey(DmsRoleBannerSetRelation record);
}