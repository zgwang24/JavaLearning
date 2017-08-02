package annotation;

public class RetryTest {
	@Retry(interval = 3, time = 2000)
	public static boolean test(int i){
		if(i > 0){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		test(-1);
	}
}
