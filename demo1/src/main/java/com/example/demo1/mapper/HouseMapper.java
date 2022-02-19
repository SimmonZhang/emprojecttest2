package com.example.demo1.mapper;

import com.example.demo1.model.House;
import com.example.demo1.model.HouseExample;
import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(String houseId);

    int insert(House record);

    int insertSelective(House record);

    List<House> selectByExample(HouseExample example);

    House selectByPrimaryKey(String houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}