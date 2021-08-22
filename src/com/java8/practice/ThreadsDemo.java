package com.java8.practice;


/**
 * 
 * @author anind
 * Using normal Programming
 *
 */
/**
public class ThreadsDemo{
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

}
*/
/**
 * Using Lambda Expression
 */
class ThreadsDemo{
	public static void main(String [] args){
		Runnable r = ()->{
			for (int i=0;i<10;i++){
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}

