package multithreading;
//Different state working
public class MyThread extends Thread{
	private int data;
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1;i<=50;i++)
			System.out.println(name+": "+ ++data);
	}
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("First");
		 MyThread mt2 = new MyThread();
		 mt2.setName("second");
		 MyThread mt3= new MyThread();
		 mt3.setName("third");
		 mt1.setPriority(MIN_PRIORITY);
		 mt3.setPriority(MAX_PRIORITY);
		 
		 mt1.start();
		 mt2.start();
		 mt3.start();
		 
		 String name= Thread.currentThread().getName();
		 for(int p=0;p<=50;p++)
			 System.out.println(name+" : "+ p);
		
	}
}
