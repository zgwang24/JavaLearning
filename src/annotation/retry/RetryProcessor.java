package annotation.retry;

import java.lang.reflect.Method;

class MyRunnable implements Runnable{
	private int interval;
	private int time;
	private Method method;
	public MyRunnable(int interval, int time, Method method){
		this.interval = interval;
		this.time = time;
		this.method = method;
	}
	@Override
	public void run() {
		for(int i = 0; i < interval; i++){
			try {
				method.invoke(new Object(), "Hello World");
				Thread.sleep(time);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class RetryProcessor {
	public void parseMethod(Class<?> clazz) throws Exception{
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods){
			Retry retry = method.getAnnotation(Retry.class);
			if(retry != null){
				int interval = retry.interval();
				int time = retry.time();
				System.out.println(interval);
				System.out.println(time);
				Thread t = new Thread(new MyRunnable(interval, time, method));
				t.start();
			}
		}
	}
}
