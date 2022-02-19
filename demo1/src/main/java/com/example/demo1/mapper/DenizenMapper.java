package com.example.demo1.mapper;

import com.example.demo1.model.Denizen;
import com.example.demo1.model.DenizenExample;
import java.util.List;

public interface DenizenMapper {
    int deleteByPrimaryKey(String denizenId);

    int insert(Denizen record);

    int insertSelective(Denizen record);

    List<Denizen> selectByExample(DenizenExample example);

    Denizen selectByPrimaryKey(String denizenId);

    int updateByPrimaryKeySelective(Denizen record);

    int updateByPrimaryKey(Denizen record);
}