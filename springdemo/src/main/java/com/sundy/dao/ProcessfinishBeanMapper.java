package com.sundy.dao;

import com.sundy.model.ProcessfinishBean;

public interface ProcessfinishBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessfinishBean record);

    int insertSelective(ProcessfinishBean record);

    ProcessfinishBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessfinishBean record);

    int updateByPrimaryKey(ProcessfinishBean record);
}