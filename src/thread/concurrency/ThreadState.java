package thread.concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadState {
	static class TimeWaiting implements Runnable{
		@Override
		public void run() {
			while(true){
				SleepUtils.second(100);
			}
		}
	}
	static class Waiting implements Runnable{
		@Override
		public void run() {
			while(true){
				synchronized(Waiting.class){
					try{
						Waiting.class.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
	static class Blocked implements Runnable{
		public void run(){
			synchronized(Blocked.class){
				while(true){
					SleepUtils.second(100);
				}
			}
		}
	}
	static class SleepUtils{
		public final static void second(long seconds){
			try{
				TimeUnit.SECONDS.sleep(seconds);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Thread(new TimeWaiting(), "TimeWaitingThread").start();
		new Thread(new Waiting(), "WaitingThread").start();
		new Thread(new Blocked(), "BlockedThread-1").start();
		new Thread(new Blocked(), "BlockedThread-2").start();
	}
}
