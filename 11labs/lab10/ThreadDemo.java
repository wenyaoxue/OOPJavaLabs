package lab10;

public class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	private ConferenceRoomBookingJob CR;
	private ProjectManager pm;
	
	public ThreadDemo(String threadName, ConferenceRoomBookingJob cR) {
		super();
		this.threadName = threadName;
		CR = cR;
	}
	
	public void run() {
		synchronized(CR) {
			CR.book(pm);
		}
		System.out.println("Thread " + threadName + " exiting");
	}
	public void start(ProjectManager pm) {
		System.out.println("Starting " + threadName);
		this.pm = pm;
		if (t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
}
