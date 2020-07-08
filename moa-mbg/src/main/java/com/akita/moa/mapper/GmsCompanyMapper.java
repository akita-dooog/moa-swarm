package com.akita.moa.mapper;

import com.akita.moa.model.GmsCompany;
import com.akita.moa.model.GmsCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GmsCompanyMapper {
    long countByExample(GmsCompanyExample example);

    int deleteByExample(GmsCompanyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GmsCompany record);

    int insertSelective(GmsCompany record);

    List<GmsCompany> selectByExample(GmsCompanyExample example);

    GmsCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GmsCompany record, @Param("example") GmsCompanyExample example);

    int updateByExample(@Param("record") GmsCompany record, @Param("example") GmsCompanyExample example);

    int updateByPrimaryKeySelective(GmsCompany record);

    int updateByPrimaryKey(GmsCompany record);
}