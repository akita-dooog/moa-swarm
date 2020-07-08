package com.akita.moa.mapper;

import com.akita.moa.model.PmsClient;
import com.akita.moa.model.PmsClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsClientMapper {
    long countByExample(PmsClientExample example);

    int deleteByExample(PmsClientExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsClient record);

    int insertSelective(PmsClient record);

    List<PmsClient> selectByExample(PmsClientExample example);

    PmsClient selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsClient record, @Param("example") PmsClientExample example);

    int updateByExample(@Param("record") PmsClient record, @Param("example") PmsClientExample example);

    int updateByPrimaryKeySelective(PmsClient record);

    int updateByPrimaryKey(PmsClient record);
}