package thread;

public class GenerateThread2 implements Runnable{
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){			
			try {
				System.out.println(Thread.currentThread().getName() + "---" + i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new GenerateThread2());
		Thread t2 = new Thread(new GenerateThread2());
		t1.start();
		t2.start();
	}
}
