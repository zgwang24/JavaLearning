package annotation;

class MyRunnable implements Runnable{
	private int interval;
	private int time;
	public MyRunnable(int interval, int time){
		this.interval = interval;
		this.time = time;
	}
	@Override
	public void run() {
		for(int i = 0; i < interval - 1; i++){
			try {
				RetryTest.test(-1);
				System.out.println(i + 2);
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class ParseRetry {
	public static void main(String[] args) {
		RetryTest retry = new RetryTest();
		Class retryC = retry.getClass();
	}
}
