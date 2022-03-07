package multithreading;
//Multiple Threads working on a same object
public class MyRunnable implements Runnable {
private int data;

public void run() {
	Thread t = Thread.currentThread();
	String name=t.getName();
	for(int i=0;i<50;i++)
		System.out.println(name+": "+ ++data);
		}
	public static void main(String[] args) {
		Runnable mr= new MyRunnable();
		Thread t1= new Thread(mr);
		t1.setName("First");
		
		Thread t2= new Thread(mr,"Second");
		Thread t3 = new Thread(mr,"Third");
		t1.start();
		t2.start();
		t3.start();
		
	}


}
