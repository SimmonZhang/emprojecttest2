package com.example.demo1.service;

import com.example.demo1.model.Spend;
import com.example.demo1.model.pageinfo.SpendPage;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
public interface SpendService {

 PageInfo<Spend> selectSpendByExample(SpendPage spendPage, int pageSize);

 String insertSpend(Spend spend);

 String deleteSpend(String id);

 String updateSpend(Spend spend);

}
