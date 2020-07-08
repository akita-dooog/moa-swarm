package com.akita.moa.mapper;

import com.akita.moa.model.OmsEssaySetRelation;
import com.akita.moa.model.OmsEssaySetRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsEssaySetRelationMapper {
    long countByExample(OmsEssaySetRelationExample example);

    int deleteByExample(OmsEssaySetRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsEssaySetRelation record);

    int insertSelective(OmsEssaySetRelation record);

    List<OmsEssaySetRelation> selectByExample(OmsEssaySetRelationExample example);

    OmsEssaySetRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsEssaySetRelation record, @Param("example") OmsEssaySetRelationExample example);

    int updateByExample(@Param("record") OmsEssaySetRelation record, @Param("example") OmsEssaySetRelationExample example);

    int updateByPrimaryKeySelective(OmsEssaySetRelation record);

    int updateByPrimaryKey(OmsEssaySetRelation record);
}