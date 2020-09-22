package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;
import com.itheima.pojo.Setmeal;

import java.util.List;
import java.util.Map;

public interface SetmealDao {
    //新增套餐
    void addSetmeal(Setmeal setmeal);
    //新增关联关系
    void setSetmealIdAndCheckGroupId(Map map);
}
