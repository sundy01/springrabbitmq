package com.sundy.service.impl;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component("queueListenter")
public class MQCutomerListener implements MessageListener{

	@Override
	public void onMessage(Message msg) {
		try{
            System.out.print(msg.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
		
	}

}
