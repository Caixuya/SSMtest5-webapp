package com.thxy.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {

	private Logger logger=Logger.getLogger(AroundLogger.class);
	
	//ProceedingJoinPoint 与JoinPoint的区别是：
	//ProceedingJoinPoint表示即将连接点，表示增强的方法可能被执行，也可能被阻止执行
	
	//该类添加最终增强方法
	//该方法出传入一个ProceedingJoinPoint对象，使用ProceedingJoinPint对象的proceeding方法获取被增强的方法返回值
	//并在该方法执行前、执行后、异常处理时对其进行增强。
	
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		
		Object obj=null;
		logger.info("方法即将执行");
		try {
			obj=jp.proceed();
			logger.info(jp.getSignature().getName()+"方法正常执行");
		}catch(Throwable e) {
			logger.error(jp.getSignature().getName()+"方法异常");
		}
		
		logger.info("方法执行完毕");
		return obj;
		
	}
}
