package com.akita.moa.mapper;

import com.akita.moa.model.OmsOfficialAccount;
import com.akita.moa.model.OmsOfficialAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsOfficialAccountMapper {
    long countByExample(OmsOfficialAccountExample example);

    int deleteByExample(OmsOfficialAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOfficialAccount record);

    int insertSelective(OmsOfficialAccount record);

    List<OmsOfficialAccount> selectByExample(OmsOfficialAccountExample example);

    OmsOfficialAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOfficialAccount record, @Param("example") OmsOfficialAccountExample example);

    int updateByExample(@Param("record") OmsOfficialAccount record, @Param("example") OmsOfficialAccountExample example);

    int updateByPrimaryKeySelective(OmsOfficialAccount record);

    int updateByPrimaryKey(OmsOfficialAccount record);
}