package com.sundy.dao;

import com.sundy.model.StudentBean;

public interface StudentBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentBean record);

    int insertSelective(StudentBean record);

    StudentBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentBean record);

    int updateByPrimaryKey(StudentBean record);
}