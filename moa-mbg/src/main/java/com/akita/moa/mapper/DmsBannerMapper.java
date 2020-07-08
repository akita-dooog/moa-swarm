package com.akita.moa.mapper;

import com.akita.moa.model.DmsBanner;
import com.akita.moa.model.DmsBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBannerMapper {
    long countByExample(DmsBannerExample example);

    int deleteByExample(DmsBannerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsBanner record);

    int insertSelective(DmsBanner record);

    List<DmsBanner> selectByExample(DmsBannerExample example);

    DmsBanner selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsBanner record, @Param("example") DmsBannerExample example);

    int updateByExample(@Param("record") DmsBanner record, @Param("example") DmsBannerExample example);

    int updateByPrimaryKeySelective(DmsBanner record);

    int updateByPrimaryKey(DmsBanner record);
}