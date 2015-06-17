package hm;

public class MyThread2 extends Thread{
	public void run(){
		System.out.println("The thread is started!");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("The thread is completed!");
	}

}
