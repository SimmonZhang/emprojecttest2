package com.example.demo1.mapper;

import com.example.demo1.model.Parking;
import com.example.demo1.model.ParkingExample;
import java.util.List;

public interface ParkingMapper {
    int deleteByPrimaryKey(String parkingId);

    int insert(Parking record);

    int insertSelective(Parking record);

    List<Parking> selectByExample(ParkingExample example);

    Parking selectByPrimaryKey(String parkingId);

    int updateByPrimaryKeySelective(Parking record);

    int updateByPrimaryKey(Parking record);
}