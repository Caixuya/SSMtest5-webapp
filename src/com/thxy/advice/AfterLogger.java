package com.thxy.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class AfterLogger {
	
	//添加最终增强方法
	//该方法出传入一个JoinPoint对象，使用JoinPint对象获取被增强的方法信息
	
	private Logger logger= Logger.getLogger(AfterLogger.class);
	
	public void after(JoinPoint jp) {
		System.out.println("方法执行结束了");
		logger.info("方法执行结束");
	}

}
