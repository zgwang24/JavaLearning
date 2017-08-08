package thread.pool;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		int corePoolSize = 10;
		int maxmiumPoolSize = 15;
		long leepAliveTime = 2000;
		TimeUnit timeUnit = TimeUnit.MILLISECONDS;
		BlockingQueue<Runnable> workQueue = null;
		RejectedExecutionHandler rejectedExecutionHandler = null;
		Executor threadPool =  new ThreadPoolExecutor(corePoolSize,
				maxmiumPoolSize, leepAliveTime, timeUnit, workQueue, 
				rejectedExecutionHandler);
		
		threadPool.execute(new Runnable(){
			@Override
			public void run() {
				
			}			
		});
		
		Executor executor = new ThreadPoolExecutor(corePoolSize, maxmiumPoolSize, leepAliveTime, timeUnit, workQueue); 
		Future<Object> future = executor.s
	}
}
