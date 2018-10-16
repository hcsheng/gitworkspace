package com.hcs.single;

public class Singleton {
	
	private static final Singleton single = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		return single;
	}
	
	public static void doSomething(String num) {
		
		System.out.println("我是第"+num+"个学生。");
	}

}
