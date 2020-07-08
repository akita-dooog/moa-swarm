package com.akita.moa.mapper;

import com.akita.moa.model.ImsMessage;
import com.akita.moa.model.ImsMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsMessageMapper {
    long countByExample(ImsMessageExample example);

    int deleteByExample(ImsMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImsMessage record);

    int insertSelective(ImsMessage record);

    List<ImsMessage> selectByExampleWithBLOBs(ImsMessageExample example);

    List<ImsMessage> selectByExample(ImsMessageExample example);

    ImsMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImsMessage record, @Param("example") ImsMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") ImsMessage record, @Param("example") ImsMessageExample example);

    int updateByExample(@Param("record") ImsMessage record, @Param("example") ImsMessageExample example);

    int updateByPrimaryKeySelective(ImsMessage record);

    int updateByPrimaryKeyWithBLOBs(ImsMessage record);

    int updateByPrimaryKey(ImsMessage record);
}