package com.akita.moa.mapper;

import com.akita.moa.model.OmsOfficialEssay;
import com.akita.moa.model.OmsOfficialEssayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOfficialEssayMapper {
    long countByExample(OmsOfficialEssayExample example);

    int deleteByExample(OmsOfficialEssayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOfficialEssay record);

    int insertSelective(OmsOfficialEssay record);

    List<OmsOfficialEssay> selectByExampleWithBLOBs(OmsOfficialEssayExample example);

    List<OmsOfficialEssay> selectByExample(OmsOfficialEssayExample example);

    OmsOfficialEssay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOfficialEssay record, @Param("example") OmsOfficialEssayExample example);

    int updateByExampleWithBLOBs(@Param("record") OmsOfficialEssay record, @Param("example") OmsOfficialEssayExample example);

    int updateByExample(@Param("record") OmsOfficialEssay record, @Param("example") OmsOfficialEssayExample example);

    int updateByPrimaryKeySelective(OmsOfficialEssay record);

    int updateByPrimaryKeyWithBLOBs(OmsOfficialEssay record);

    int updateByPrimaryKey(OmsOfficialEssay record);
}