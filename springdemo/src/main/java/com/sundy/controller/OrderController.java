package com.sundy.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sundy.model.StudentBean;
import com.sundy.service.interfaces.IOrderService;
import com.sundy.service.interfaces.MQProducer;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private IOrderService orderService;
	@Autowired
	private MQProducer producerService;

	
	@RequestMapping(value="/add")
	@ResponseBody
	public void add() throws Exception{
		

      StudentBean bean=new StudentBean();
      bean.setName("王奎ss");
      bean.setCreatetime(new Date());
      bean.setGender("M");
      this.orderService.saveStudentBean(bean);
	        
	}
	
	
	@RequestMapping(value="/sendMessage")
	@ResponseBody
	public void sendMessage() throws Exception{
		
		StudentBean bean=this.orderService.queryList();
		
		this.producerService.sendDataToQueue("demo",bean);
	        
	}
	
	@RequestMapping(value="/getBean")
	@ResponseBody
	public StudentBean getBean() throws Exception{
		

      return this.orderService.queryList();
	        
	}

}
