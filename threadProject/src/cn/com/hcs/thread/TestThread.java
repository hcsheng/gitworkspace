package cn.com.hcs.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class TestThread {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 //方式二
		System.out.println(System.currentTimeMillis()+"：开始时间");
		Thread two = new Thread(new ThreadTwo());
		System.out.println(System.currentTimeMillis()+"：创建时间");
		
		two.start();
		System.out.println(System.currentTimeMillis()+"：开始时间");
		System.out.println(two.getId());
		
		
		System.out.println(two.isAlive());
		System.out.println(System.currentTimeMillis()+"：结束时间");*/
		
		/*//方式三
		Callable<Object> call = new ThreadThree();
		FutureTask<Object> future = new FutureTask<Object>(call);
		
		Thread three = new Thread(future);
		three.start();
		//获取线程返回值
		System.out.println(future.get()+"------");*/
		
		//方式四    线程池创建线程
		/*ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0;i<8;i++) {
			ThreadTwo two = new ThreadTwo();
			executor.execute(two);
		}
		
		executor.shutdown();*/
		
		
		System.out.println(Thread.currentThread().getName());
		
	}

}
