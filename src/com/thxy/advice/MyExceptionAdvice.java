package com.thxy.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class MyExceptionAdvice {

	
	//添加一个异常增强方法
	//该方法出传入一个JoinPoint对象和一个RuntimeException对象，使用JoinPint对象获取被增强的方法信息。使用RuntimeException对象获取异常信
	
	private Logger logger = Logger.getLogger(MyExceptionAdvice.class);
	
	public void afterThrowing(JoinPoint jp,RuntimeException re) {
		
		System.out.println("出错了");
		logger.error("出错的方法为:"+jp.getSignature().getName()+"，其异常为："+re.getMessage());
	}
}
