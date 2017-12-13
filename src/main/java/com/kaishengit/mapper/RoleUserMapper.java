package com.kaishengit.mapper;

import com.kaishengit.entity.RoleUserExample;
import com.kaishengit.entity.RoleUserKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleUserMapper {
    long countByExample(RoleUserExample example);

    int deleteByExample(RoleUserExample example);

    int deleteByPrimaryKey(RoleUserKey key);

    int insert(RoleUserKey record);

    int insertSelective(RoleUserKey record);

    List<RoleUserKey> selectByExample(RoleUserExample example);

    int updateByExampleSelective(@Param("record") RoleUserKey record, @Param("example") RoleUserExample example);

    int updateByExample(@Param("record") RoleUserKey record, @Param("example") RoleUserExample example);
}