package hm;

public class MyThread4 extends Thread{
	public void run(){
		System.out.println("The thread is started!");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("The thread is completed!");
	}
}
