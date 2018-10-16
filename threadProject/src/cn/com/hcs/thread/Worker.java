package cn.com.hcs.thread;

import java.util.Map;
import java.util.Queue;

public class Worker implements Runnable{
	
	protected Queue<Object> workQueue;
	
	protected Map<String,Object> resultMap;

	public void setWorkQueue(Queue<Object> workQueue) {
		this.workQueue = workQueue;
	}
	
	public void setResultMap(Map<String,Object> resultMap) {
		this.resultMap = resultMap;
	}
	
	//子任务 处理逻辑   在子类中实现具体逻辑
	public Object handle(Object input) {
		return input;
	}
	
	
	@Override
	public void run() {
		Object object = new Object();
		while(true) {
			Object input = workQueue.poll();
			if(input != null) {
				object = handle(input);
			}
			resultMap.put(Integer.toString(input.hashCode()), object);
		}
		
	}
	

}
