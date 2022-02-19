package com.example.demo1.service;


import com.example.demo1.model.Denizen;
import com.example.demo1.model.pageinfo.DePage;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-16
 */
public interface DenizenService {

 PageInfo<Denizen> selectDenizenByExample(DePage dePage, int pageSize);

 String insertDenizen(Denizen denizen);

 String deleteDenizen(String id);

 String updateDenizen(Denizen denizen);

}
