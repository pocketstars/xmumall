package com.xmu.xmumall.dao;

import com.xmu.xmumall.entity.Classification;
import com.xmu.xmumall.entity.ClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationMapper {
    long countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}