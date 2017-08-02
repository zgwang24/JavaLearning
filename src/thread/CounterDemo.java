package thread;

public class CounterDemo {
	public static int count = 0;
	public static void inc(){
		try{
			Thread.sleep(1);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		count++;
	}
	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++){
			new Thread(new Runnable(){
				@Override
				public void run(){
					CounterDemo.inc();
				}
			}).start();
		}
		System.out.println(CounterDemo.count);
	}
}
