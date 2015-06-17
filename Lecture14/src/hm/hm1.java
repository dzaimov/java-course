package hm;

public class hm1 {

	public static void main(String[] args) {
		MyThread1 t1= new MyThread1();
		t1.setName("Thread1");
		MyThread2 t2= new MyThread2();
		t2.setName("Thread2");
		MyThread3 t3= new MyThread3();
		t3.setName("Thread3");
		MyThread4 t4= new MyThread4();
		t4.setName("Thread4");
		MyThread5 t5= new MyThread5();
		t5.setName("Thread5");
		
		System.out.println(t1.getName());
		t1.start();
		System.out.println(t2.getName());
		t2.start();
		System.out.println(t3.getName());
		t3.start();
		System.out.println(t4.getName());
		t4.start();
		System.out.println(t5.getName());
		t5.start();

	}

}
