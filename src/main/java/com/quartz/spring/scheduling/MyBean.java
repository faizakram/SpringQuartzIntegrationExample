package com.quartz.spring.scheduling;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Faiz Akram
 *
 */
@Component("myBean")
public class MyBean {

	public void printMessage() {
		System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	}
	
}
