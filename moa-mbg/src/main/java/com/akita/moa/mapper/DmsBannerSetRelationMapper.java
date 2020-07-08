package com.akita.moa.mapper;

import com.akita.moa.model.DmsBannerSetRelation;
import com.akita.moa.model.DmsBannerSetRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBannerSetRelationMapper {
    long countByExample(DmsBannerSetRelationExample example);

    int deleteByExample(DmsBannerSetRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsBannerSetRelation record);

    int insertSelective(DmsBannerSetRelation record);

    List<DmsBannerSetRelation> selectByExample(DmsBannerSetRelationExample example);

    DmsBannerSetRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsBannerSetRelation record, @Param("example") DmsBannerSetRelationExample example);

    int updateByExample(@Param("record") DmsBannerSetRelation record, @Param("example") DmsBannerSetRelationExample example);

    int updateByPrimaryKeySelective(DmsBannerSetRelation record);

    int updateByPrimaryKey(DmsBannerSetRelation record);
}