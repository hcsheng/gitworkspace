package cn.com.hcs.thread;

/**
* @ClassName: ThreadTwo
* @Description: 线程实现方式二：  实现 Runable
* @author A18ccms a18ccms_gmail_com
* @date 2018年10月13日 上午11:11:21
* 实现方式 ： 接口的实现类的实例作为Thread的target作为参数传入带参的Thread构造函数，通过调用start()方法启动线程
 */
public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"线程实现方式二：  implements  Runable");
		
	}

}
