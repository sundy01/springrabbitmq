package com.sundy.dao;

import com.sundy.model.LoginBean;

public interface LoginBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginBean record);

    int insertSelective(LoginBean record);

    LoginBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginBean record);

    int updateByPrimaryKey(LoginBean record);
}