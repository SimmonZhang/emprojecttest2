package com.example.demo1.mapper;

import com.example.demo1.model.Spend;
import com.example.demo1.model.SpendExample;
import java.util.List;

public interface SpendMapper {
    int deleteByPrimaryKey(String spendId);

    int insert(Spend record);

    int insertSelective(Spend record);

    List<Spend> selectByExample(SpendExample example);

    Spend selectByPrimaryKey(String spendId);

    int updateByPrimaryKeySelective(Spend record);

    int updateByPrimaryKey(Spend record);
}