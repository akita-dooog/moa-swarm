package com.akita.moa.mapper;

import com.akita.moa.model.OmsUserOffiacctRelation;
import com.akita.moa.model.OmsUserOffiacctRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsUserOffiacctRelationMapper {
    long countByExample(OmsUserOffiacctRelationExample example);

    int deleteByExample(OmsUserOffiacctRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsUserOffiacctRelation record);

    int insertSelective(OmsUserOffiacctRelation record);

    List<OmsUserOffiacctRelation> selectByExample(OmsUserOffiacctRelationExample example);

    OmsUserOffiacctRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsUserOffiacctRelation record, @Param("example") OmsUserOffiacctRelationExample example);

    int updateByExample(@Param("record") OmsUserOffiacctRelation record, @Param("example") OmsUserOffiacctRelationExample example);

    int updateByPrimaryKeySelective(OmsUserOffiacctRelation record);

    int updateByPrimaryKey(OmsUserOffiacctRelation record);
}