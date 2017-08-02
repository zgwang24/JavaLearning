package thread;

public class GenerateThread1 extends Thread{
	private int count = 10;
	public void run(){
		for(int i = 0; i < count; i++){
			System.out.println(getClass().getName() + i);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new GenerateThread1();
		Thread t2 = new GenerateThread1();
		t1.start();
		t2.start();
	}
}
