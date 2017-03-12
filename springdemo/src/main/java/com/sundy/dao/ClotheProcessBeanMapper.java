package com.sundy.dao;

import com.sundy.model.ClotheProcessBean;

public interface ClotheProcessBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClotheProcessBean record);

    int insertSelective(ClotheProcessBean record);

    ClotheProcessBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClotheProcessBean record);

    int updateByPrimaryKey(ClotheProcessBean record);
}