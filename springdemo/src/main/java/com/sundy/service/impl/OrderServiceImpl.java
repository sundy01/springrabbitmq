package com.sundy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sundy.dao.StudentBeanMapper;
import com.sundy.model.StudentBean;
import com.sundy.service.interfaces.IOrderService;

@Component("orderServiceImpl")
public class OrderServiceImpl implements IOrderService {
    @Autowired
	private StudentBeanMapper studentMapper;
    
    @Transactional
	@Override
	public void saveStudentBean(StudentBean bean) throws Exception {
		this.studentMapper.insert(bean);
		
		
		throw new RuntimeException("sss");
	}

	@Override
	public StudentBean queryList() {
		
		return this.studentMapper.selectByPrimaryKey(6);
	}
	

}
