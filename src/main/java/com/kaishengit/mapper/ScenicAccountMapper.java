package com.kaishengit.mapper;

import com.kaishengit.entity.ScenicAccount;
import com.kaishengit.entity.ScenicAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScenicAccountMapper {
    long countByExample(ScenicAccountExample example);

    int deleteByExample(ScenicAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicAccount record);

    int insertSelective(ScenicAccount record);

    List<ScenicAccount> selectByExample(ScenicAccountExample example);

    ScenicAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenicAccount record, @Param("example") ScenicAccountExample example);

    int updateByExample(@Param("record") ScenicAccount record, @Param("example") ScenicAccountExample example);

    int updateByPrimaryKeySelective(ScenicAccount record);

    int updateByPrimaryKey(ScenicAccount record);
}