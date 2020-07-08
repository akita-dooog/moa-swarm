package com.akita.moa.mapper;

import com.akita.moa.model.GmsLoginLog;
import com.akita.moa.model.GmsLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsLoginLogMapper {
    long countByExample(GmsLoginLogExample example);

    int deleteByExample(GmsLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsLoginLog record);

    int insertSelective(GmsLoginLog record);

    List<GmsLoginLog> selectByExample(GmsLoginLogExample example);

    GmsLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsLoginLog record, @Param("example") GmsLoginLogExample example);

    int updateByExample(@Param("record") GmsLoginLog record, @Param("example") GmsLoginLogExample example);

    int updateByPrimaryKeySelective(GmsLoginLog record);

    int updateByPrimaryKey(GmsLoginLog record);
}