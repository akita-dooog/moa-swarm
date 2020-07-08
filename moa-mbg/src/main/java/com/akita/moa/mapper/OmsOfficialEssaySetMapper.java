package com.akita.moa.mapper;

import com.akita.moa.model.OmsOfficialEssaySet;
import com.akita.moa.model.OmsOfficialEssaySetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOfficialEssaySetMapper {
    long countByExample(OmsOfficialEssaySetExample example);

    int deleteByExample(OmsOfficialEssaySetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOfficialEssaySet record);

    int insertSelective(OmsOfficialEssaySet record);

    List<OmsOfficialEssaySet> selectByExample(OmsOfficialEssaySetExample example);

    OmsOfficialEssaySet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOfficialEssaySet record, @Param("example") OmsOfficialEssaySetExample example);

    int updateByExample(@Param("record") OmsOfficialEssaySet record, @Param("example") OmsOfficialEssaySetExample example);

    int updateByPrimaryKeySelective(OmsOfficialEssaySet record);

    int updateByPrimaryKey(OmsOfficialEssaySet record);
}