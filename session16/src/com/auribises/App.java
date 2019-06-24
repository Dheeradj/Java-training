package com.auribises;

//class MyTask{
//	
//	void executeTask() {
//		for(int i=1;i<100;i++) {
//			System.out.println("Printing Learning Phyton.pdf page#"+i);
//			
//		}
//	}
//}

class MyTask extends Thread{//MyTask is-a Thread
//	run is a method which we need to override
//	all tasks to be executed by child must be written in run method
	
	public void run() {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("**Printing LearningPython.pdf Page#"+i);
		
			
		}
	}
}


class CA{
	
}

//Multiple inheritance is not supported
//class YourTask extends CA, Thread{
class YourTask extends CA implements Runnable{	
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("@@ Printing go.pdf page#"+i);
		}
	}
}

public class App {

	public static void main(String[] args) {

		System.out.println("App started");
		MyTask mRef = new MyTask();
	//	mRef.executeTask();
		
		
		Runnable r = new MyTask();
		Thread yRef= new Thread(r);
		
		mRef.setDaemon(true);
		
		Thread.currentThread().setName("John");
		mRef.setName("Fionna");
		yRef.setName("Leo");
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		mRef.setPriority(Thread.MIN_PRIORITY);
		yRef.setPriority(Thread.NORM_PRIORITY);
		
		mRef.start();// Internally execute run method
		try {
			mRef.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Task 2
		yRef.start();// Internally execute run method
	
		for(int i=1;i<=10;i++) {
		try {
			yRef.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("printing  learning java.pdf page#"+i);
	}
		System.out.println("== main thread name: "+Thread.currentThread().getName());	
		System.out.println("== MyTask name is: "+mRef.getName());
		System.out.println("== YourTask name is: "+yRef.getName());
		
		
		System.out.println("== main thread priority: "+Thread.currentThread().getPriority());	
		System.out.println("== MyTask priority is: "+mRef.getPriority());
		System.out.println("== YourTask priority is: "+yRef.getPriority());
	
	System.out.println("App stopped");
	}

}
