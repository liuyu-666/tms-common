package com.kaishengit.mapper;

import com.kaishengit.entity.UserLogInfo;
import com.kaishengit.entity.UserLogInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLogInfoMapper {
    long countByExample(UserLogInfoExample example);

    int deleteByExample(UserLogInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLogInfo record);

    int insertSelective(UserLogInfo record);

    List<UserLogInfo> selectByExample(UserLogInfoExample example);

    UserLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLogInfo record, @Param("example") UserLogInfoExample example);

    int updateByExample(@Param("record") UserLogInfo record, @Param("example") UserLogInfoExample example);

    int updateByPrimaryKeySelective(UserLogInfo record);

    int updateByPrimaryKey(UserLogInfo record);
}