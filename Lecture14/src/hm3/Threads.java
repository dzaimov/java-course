package hm3;

public class Threads extends Thread{
	synchronized void numbers() {
		
		for (int i = 1; i <= 50000; i++) {
			System.out.println(i);
			if(i == 25000){
				System.out.println("twenty-five thousand");
				try {
					wait();
				} catch (Exception e) {
	
				}
				System.out.println(i);
			}
			
		}

	}

	synchronized void message() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Runnig... ");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		notify();
	}
	
	public static void main(String[] args) {
		final Threads t = new Threads();
		new Threads() {
			public void run() {
				t.numbers();
			}
		}.start();
		
		new Threads() {
			public void run() {
				t.message();
			}
		}.start();

	}

}
