package cn.com.hcs.thread;

/**
* @ClassName: ThreadOne
* @Description: 线程实现方式一  继承 Thread
* @author A18ccms a18ccms_gmail_com
* @date 2018年10月13日 上午11:00:31
* 实现方式：继承    直接new  
 */
public class ThreadOne extends Thread{
	
	public void run() {
		
		System.out.println("线程实现方式一 ： 继承Thread.");
		
	}
	
	

}
