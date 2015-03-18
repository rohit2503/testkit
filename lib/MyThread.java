package javareload;

class Shared {
	int x;
	
	synchronized void  show(String s, int a){
		x =a;
		System.out.println("Starting method Show" +s +" "+ a);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Exception caught in show " +s +" "+ x);
	}

	synchronized void  show1(String s, int a){
		x = a;
		System.out.println("Starting method Show1" +s +" "+ a);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Exception caught in show1 " +s +" "+ x);
	}
}

public class MyThread extends Thread {
	Shared s;
	
	public MyThread(Shared s, String str) {
		super(str);
		this.s = s;
		start();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		s.show(Thread.currentThread().getName(), 10);
	}

}
