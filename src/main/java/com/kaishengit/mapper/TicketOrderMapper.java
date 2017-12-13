package com.kaishengit.mapper;

import com.kaishengit.entity.TicketOrder;
import com.kaishengit.entity.TicketOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketOrderMapper {
    long countByExample(TicketOrderExample example);

    int deleteByExample(TicketOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketOrder record);

    int insertSelective(TicketOrder record);

    List<TicketOrder> selectByExample(TicketOrderExample example);

    TicketOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketOrder record, @Param("example") TicketOrderExample example);

    int updateByExample(@Param("record") TicketOrder record, @Param("example") TicketOrderExample example);

    int updateByPrimaryKeySelective(TicketOrder record);

    int updateByPrimaryKey(TicketOrder record);
}