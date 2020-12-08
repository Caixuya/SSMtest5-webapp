package com.thxy.service;

public class UserServiceImpl {
	//编写字符串属性name
	public String name;

	public UserServiceImpl(String name) {
		
		//编写带字符串参数name的构造方法
		//在该方法中将参数赋值属性name
		super();
		this.name = name;
	}
	
	//添加getter和setter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserServiceImpl(){
		
		//编写无参的构造方法
	}

	public void SayHello() {
		
		//编写无返回值的sayHello
		//方法的功能是：当name属性值为null，控制台输出Hello World!；否则输出Hello name的值
		
		if(null==name) {
			System.out.println("Hello World!");
		}else {
			System.out.println("Hello"+name);
		}
	}
	public void say() {
		int i=3/0;	//环绕增强注释掉此句
		
		if(null==name) {
			System.out.println("Hello World!");
		}else {
			System.out.println("Hello"+name);
		}
	}
}
