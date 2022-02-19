package com.example.demo1.service;

import com.example.demo1.model.House;
import com.example.demo1.model.pageinfo.HoPage;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
public interface HouseService {

 PageInfo<House> selectHouseByExample(HoPage hoPage,int pageSize);

 String insertHouse(House house);

 String deleteHouse(String id);

 String updateHouse(House house);

}
