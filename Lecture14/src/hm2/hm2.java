package hm2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class hm2 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		for (int i = 0; i < 5; i++) {
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("The threads are completed");
	}
}


