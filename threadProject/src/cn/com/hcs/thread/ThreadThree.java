package cn.com.hcs.thread;

import java.util.concurrent.Callable;

/**
* @ClassName: ThreadThree
* @Description: 实现方式三：  实现 Callable<Object>
* @author A18ccms a18ccms_gmail_com
* @date 2018年10月14日 上午7:41:21
* 实现方式： 
*       a:创建Callable接口的实现类 ，并实现Call方法
        b:创建Callable实现类的实现，使用FutureTask类包装Callable对象，该FutureTask对象封装了Callable对象的Call方法的返回值
        c:使用FutureTask对象作为Thread对象的target创建并启动线程 
        d:调用FutureTask对象的get()来获取子线程执行结束的返回值
 */
public class ThreadThree implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		System.out.println("实现方式三：  实现 Callable<Object>");
		return "1";
	}
	
	

}
