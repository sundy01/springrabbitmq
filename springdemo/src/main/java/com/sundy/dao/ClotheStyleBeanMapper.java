package com.sundy.dao;

import com.sundy.model.ClotheStyleBean;

public interface ClotheStyleBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClotheStyleBean record);

    int insertSelective(ClotheStyleBean record);

    ClotheStyleBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClotheStyleBean record);

    int updateByPrimaryKey(ClotheStyleBean record);
}