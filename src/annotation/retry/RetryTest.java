package annotation.retry;

public class RetryTest {
	@Retry
	public static void sayHello(String name){
		System.out.println("say hello1 " + name);
	}
	@Retry(interval = 9, time = 9000)
	public static void sayHello2(String name){
		System.out.println("say hello2 " + name);
	}
	public static void main(String[] args) throws Exception {
		RetryProcessor retry = new RetryProcessor();
		retry.parseMethod(RetryTest.class);
	}
}
