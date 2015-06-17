package hm2;

public class WorkerThread implements Runnable{
	private String message;

	public WorkerThread(String s) {
		this.message = " The thread is started";
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + message);
		processMessage();
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
