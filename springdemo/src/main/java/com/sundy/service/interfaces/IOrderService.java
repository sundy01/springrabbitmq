package com.sundy.service.interfaces;

import com.sundy.model.StudentBean;

public interface IOrderService {
	
	public void saveStudentBean(StudentBean bean)throws Exception;
	
	public StudentBean queryList();

}
