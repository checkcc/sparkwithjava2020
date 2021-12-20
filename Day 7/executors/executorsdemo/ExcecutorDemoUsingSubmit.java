package com.demo.executorsdemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorDemoUsingSubmit {

	public static void main(String ar[]) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);

		// ExecutorService executorService1 = Executors.newSingleThreadExecutor();

		// ExecutorService executorService2 = Executors.newScheduledThreadPool(0);

		
		//using submit
		executorService.submit(new Runnable() {
			public void run() {

				System.out.println(" executorService ");
			}
		});

		executorService.shutdown();

	}

}
