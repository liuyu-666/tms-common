package com.kaishengit.mapper;

import com.kaishengit.entity.Scenic;
import com.kaishengit.entity.ScenicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScenicMapper {
    long countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    List<Scenic> selectByExampleWithBLOBs(ScenicExample example);

    List<Scenic> selectByExample(ScenicExample example);

    Scenic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExampleWithBLOBs(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(Scenic record);

    int updateByPrimaryKeyWithBLOBs(Scenic record);

    int updateByPrimaryKey(Scenic record);
}