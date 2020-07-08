package com.akita.moa.mapper;

import com.akita.moa.model.GmsPermit;
import com.akita.moa.model.GmsPermitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsPermitMapper {
    long countByExample(GmsPermitExample example);

    int deleteByExample(GmsPermitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsPermit record);

    int insertSelective(GmsPermit record);

    List<GmsPermit> selectByExample(GmsPermitExample example);

    GmsPermit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsPermit record, @Param("example") GmsPermitExample example);

    int updateByExample(@Param("record") GmsPermit record, @Param("example") GmsPermitExample example);

    int updateByPrimaryKeySelective(GmsPermit record);

    int updateByPrimaryKey(GmsPermit record);
}