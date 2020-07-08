package com.akita.moa.mapper;

import com.akita.moa.model.GmsUserAccount;
import com.akita.moa.model.GmsUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsUserAccountMapper {
    long countByExample(GmsUserAccountExample example);

    int deleteByExample(GmsUserAccountExample example);

    int deleteByPrimaryKey(String username);

    int insert(GmsUserAccount record);

    int insertSelective(GmsUserAccount record);

    List<GmsUserAccount> selectByExample(GmsUserAccountExample example);

    GmsUserAccount selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") GmsUserAccount record, @Param("example") GmsUserAccountExample example);

    int updateByExample(@Param("record") GmsUserAccount record, @Param("example") GmsUserAccountExample example);

    int updateByPrimaryKeySelective(GmsUserAccount record);

    int updateByPrimaryKey(GmsUserAccount record);
}