package com.kaishengit.mapper;

import com.kaishengit.entity.TicketScenic;
import com.kaishengit.entity.TicketScenicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketScenicMapper {
    long countByExample(TicketScenicExample example);

    int deleteByExample(TicketScenicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketScenic record);

    int insertSelective(TicketScenic record);

    List<TicketScenic> selectByExample(TicketScenicExample example);

    TicketScenic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketScenic record, @Param("example") TicketScenicExample example);

    int updateByExample(@Param("record") TicketScenic record, @Param("example") TicketScenicExample example);

    int updateByPrimaryKeySelective(TicketScenic record);

    int updateByPrimaryKey(TicketScenic record);
}