package corejava.threads;

public class JoinTest implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("In Run");
	}
	
	public static void main(String[] args) throws InterruptedException {
		JoinTest joinTest = new JoinTest();
		Thread t = new Thread(joinTest);
		t.start();
		t.join(3000);
		System.out.println("in Main");
	}
}
