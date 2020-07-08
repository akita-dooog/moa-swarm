package com.akita.moa.mapper;

import com.akita.moa.model.GmsRole;
import com.akita.moa.model.GmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsRoleMapper {
    long countByExample(GmsRoleExample example);

    int deleteByExample(GmsRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsRole record);

    int insertSelective(GmsRole record);

    List<GmsRole> selectByExample(GmsRoleExample example);

    GmsRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsRole record, @Param("example") GmsRoleExample example);

    int updateByExample(@Param("record") GmsRole record, @Param("example") GmsRoleExample example);

    int updateByPrimaryKeySelective(GmsRole record);

    int updateByPrimaryKey(GmsRole record);
}