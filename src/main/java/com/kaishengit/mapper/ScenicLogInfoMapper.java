package com.kaishengit.mapper;

import com.kaishengit.entity.ScenicLogInfo;
import com.kaishengit.entity.ScenicLogInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScenicLogInfoMapper {
    long countByExample(ScenicLogInfoExample example);

    int deleteByExample(ScenicLogInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicLogInfo record);

    int insertSelective(ScenicLogInfo record);

    List<ScenicLogInfo> selectByExample(ScenicLogInfoExample example);

    ScenicLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenicLogInfo record, @Param("example") ScenicLogInfoExample example);

    int updateByExample(@Param("record") ScenicLogInfo record, @Param("example") ScenicLogInfoExample example);

    int updateByPrimaryKeySelective(ScenicLogInfo record);

    int updateByPrimaryKey(ScenicLogInfo record);
}