package com.kaishengit.mapper;

import com.kaishengit.entity.StoreLogInfo;
import com.kaishengit.entity.StoreLogInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreLogInfoMapper {
    long countByExample(StoreLogInfoExample example);

    int deleteByExample(StoreLogInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StoreLogInfo record);

    int insertSelective(StoreLogInfo record);

    List<StoreLogInfo> selectByExample(StoreLogInfoExample example);

    StoreLogInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StoreLogInfo record, @Param("example") StoreLogInfoExample example);

    int updateByExample(@Param("record") StoreLogInfo record, @Param("example") StoreLogInfoExample example);

    int updateByPrimaryKeySelective(StoreLogInfo record);

    int updateByPrimaryKey(StoreLogInfo record);
}