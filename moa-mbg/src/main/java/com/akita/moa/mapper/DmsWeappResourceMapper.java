package com.akita.moa.mapper;

import com.akita.moa.model.DmsWeappResource;
import com.akita.moa.model.DmsWeappResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DmsWeappResourceMapper {
    long countByExample(DmsWeappResourceExample example);

    int deleteByExample(DmsWeappResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DmsWeappResource record);

    int insertSelective(DmsWeappResource record);

    List<DmsWeappResource> selectByExample(DmsWeappResourceExample example);

    DmsWeappResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DmsWeappResource record, @Param("example") DmsWeappResourceExample example);

    int updateByExample(@Param("record") DmsWeappResource record, @Param("example") DmsWeappResourceExample example);

    int updateByPrimaryKeySelective(DmsWeappResource record);

    int updateByPrimaryKey(DmsWeappResource record);
}