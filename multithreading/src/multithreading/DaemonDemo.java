package multithreading;

public class DaemonDemo extends Thread {
	private int limit;

	public DaemonDemo(int limit, String name) {
		super(name);
		this.limit = limit;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= limit; i++) {
			System.out.println(name + ": " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonDemo d1 = new DaemonDemo(25, "First");
		DaemonDemo d2 = new DaemonDemo(50, "Second");
		DaemonDemo d3 = new DaemonDemo(100, "Third");
		DaemonDemo d4 = new DaemonDemo(50000, "Daemon");
		d4.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}

}
