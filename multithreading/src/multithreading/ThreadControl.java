package multithreading;

public class ThreadControl extends Thread {
public ThreadControl(String name) {
	super(name);
}
public void run() {
	String name= Thread.currentThread().getName();
	while(true) {
		System.out.println(name);
		Thread.yield();
		//try{
		//Thread.sleep(1);
		//}catch(InterruptedException e){}
	}
}
	public static void main(String[] args) {
		Thread t1 = new ThreadControl("hello");
		Thread t2 = new ThreadControl("World");
		t1.start();
		t2.start();
	}

}
