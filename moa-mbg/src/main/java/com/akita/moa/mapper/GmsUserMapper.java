package com.akita.moa.mapper;

import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsUserMapper {
    long countByExample(GmsUserExample example);

    int deleteByExample(GmsUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsUser record);

    int insertSelective(GmsUser record);

    List<GmsUser> selectByExample(GmsUserExample example);

    GmsUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsUser record, @Param("example") GmsUserExample example);

    int updateByExample(@Param("record") GmsUser record, @Param("example") GmsUserExample example);

    int updateByPrimaryKeySelective(GmsUser record);

    int updateByPrimaryKey(GmsUser record);
}