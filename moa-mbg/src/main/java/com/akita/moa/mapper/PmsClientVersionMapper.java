package com.akita.moa.mapper;

import com.akita.moa.model.PmsClientVersion;
import com.akita.moa.model.PmsClientVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsClientVersionMapper {
    long countByExample(PmsClientVersionExample example);

    int deleteByExample(PmsClientVersionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsClientVersion record);

    int insertSelective(PmsClientVersion record);

    List<PmsClientVersion> selectByExample(PmsClientVersionExample example);

    PmsClientVersion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsClientVersion record, @Param("example") PmsClientVersionExample example);

    int updateByExample(@Param("record") PmsClientVersion record, @Param("example") PmsClientVersionExample example);

    int updateByPrimaryKeySelective(PmsClientVersion record);

    int updateByPrimaryKey(PmsClientVersion record);
}