package com.kaishengit.mapper;

import com.kaishengit.entity.Custom;
import com.kaishengit.entity.CustomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {
    long countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}