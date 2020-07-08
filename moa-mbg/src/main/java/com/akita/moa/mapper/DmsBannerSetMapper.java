package com.akita.moa.mapper;

import com.akita.moa.model.DmsBannerSet;
import com.akita.moa.model.DmsBannerSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsBannerSetMapper {
    long countByExample(DmsBannerSetExample example);

    int deleteByExample(DmsBannerSetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsBannerSet record);

    int insertSelective(DmsBannerSet record);

    List<DmsBannerSet> selectByExample(DmsBannerSetExample example);

    DmsBannerSet selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsBannerSet record, @Param("example") DmsBannerSetExample example);

    int updateByExample(@Param("record") DmsBannerSet record, @Param("example") DmsBannerSetExample example);

    int updateByPrimaryKeySelective(DmsBannerSet record);

    int updateByPrimaryKey(DmsBannerSet record);
}