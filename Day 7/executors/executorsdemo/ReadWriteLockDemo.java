package com.demo.executorsdemo;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

	private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
	static String message = " hi";

	public static void main(String arg[]) {

		Thread t1 = new Thread(new WriterA());
		t1.setName("Writer A");

		Thread t2 = new Thread(new WriterB());
		t2.setName("Writer B");

		Thread t3 = new Thread(new Reader());
		t3.setName("Reader ");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// customize your exception message here
			e.printStackTrace();
		}

	}

	static class Reader implements Runnable {

		@Override
		public void run() {

			if (lock.isWriteLocked()) {
				System.out.println("write lock present");

			}

			lock.readLock().lock();

			try {

				Long duration = (long) (Math.random() * 10000);
				System.out.println(
						Thread.currentThread().getName() + " time taken --> " + (duration / 1000) + "--> seconds");
				Thread.sleep(duration);
			} catch (Exception e) {

				e.printStackTrace();
			}

			finally {

				System.out.println("%s  printed the document sucessfully \n" + Thread.currentThread().getName());
				lock.readLock().unlock();

				System.out.println("lock released");

			}

		}

	}

	static class WriterA implements Runnable {
		@Override
		public void run() {

			lock.writeLock().lock();

			try {

				Long duration = (long) (Math.random() * 10000);
				System.out.println(
						Thread.currentThread().getName() + " time taken --> " + (duration / 1000) + "--> seconds");
				Thread.sleep(duration);
			} catch (Exception e) {

				e.printStackTrace();
			}

			finally {

				System.out.println("%s  printed the document sucessfully \n" + Thread.currentThread().getName());
				lock.writeLock().unlock();
				message = message.concat("A");
				System.out.println("  writeLock ...lock released");

			}

		}

	}

	static class WriterB implements Runnable {

		@Override
		public void run() {

			lock.writeLock().lock();

			try {

				Long duration = (long) (Math.random() * 10000);
				System.out.println(
						Thread.currentThread().getName() + " time taken --> " + (duration / 1000) + "--> seconds");
				Thread.sleep(duration);
			} catch (Exception e) {

				e.printStackTrace();
			}

			finally {

				System.out.println("%s  printed the document sucessfully \n" + Thread.currentThread().getName());
				lock.writeLock().unlock();
				message = message.concat("A");
				System.out.println("  WriterB...lock released");

			}

		}

	}

}
