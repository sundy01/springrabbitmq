package com.sundy.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sundy.service.interfaces.MQProducer;
@Component
public class MQProducerServiceImpl implements MQProducer{
	@Autowired
	private AmqpTemplate rabbitMQTemplate;

	@Override
	public void sendDataToQueue(String queueKey, Object object) {
		
		try{
			this.rabbitMQTemplate.convertAndSend(queueKey, object);
		}catch(Exception es){
			es.printStackTrace();
		}
		
	}

}
