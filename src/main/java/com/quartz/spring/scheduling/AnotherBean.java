package com.quartz.spring.scheduling;

import org.springframework.stereotype.Component;
/**
 * 
 * @author Faiz Akram
 *
 */
@Component("anotherBean")
public class AnotherBean {
	
	public void printAnotherMessage(){
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
	}
	
}
