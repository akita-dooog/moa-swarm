package com.akita.moa.mapper;

import com.akita.moa.model.ImsUserLastMessage;
import com.akita.moa.model.ImsUserLastMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImsUserLastMessageMapper {
    long countByExample(ImsUserLastMessageExample example);

    int deleteByExample(ImsUserLastMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ImsUserLastMessage record);

    int insertSelective(ImsUserLastMessage record);

    List<ImsUserLastMessage> selectByExample(ImsUserLastMessageExample example);

    ImsUserLastMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ImsUserLastMessage record, @Param("example") ImsUserLastMessageExample example);

    int updateByExample(@Param("record") ImsUserLastMessage record, @Param("example") ImsUserLastMessageExample example);

    int updateByPrimaryKeySelective(ImsUserLastMessage record);

    int updateByPrimaryKey(ImsUserLastMessage record);
}