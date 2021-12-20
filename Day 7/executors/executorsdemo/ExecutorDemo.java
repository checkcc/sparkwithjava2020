package com.demo.executorsdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String ar[]) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
	//	ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		
		
	//	ExecutorService executorService2 = Executors.newScheduledThreadPool(0);
		

		executorService.execute(new Runnable() {
			public void run() {

				System.out.println(" executorService ");
			}
		});

		executorService.shutdown();

	}

}
