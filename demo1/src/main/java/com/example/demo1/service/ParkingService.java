package com.example.demo1.service;

import com.example.demo1.model.Parking;
import com.example.demo1.model.pageinfo.ParkingPage;
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
public interface ParkingService {

 PageInfo<Parking> selectParkingByExample(ParkingPage parkingPage, int pageSize);

 String insertParking(Parking parking);

 String deleteParking(String id);

 String updateParking(Parking parking);

}
