package thread;

public class ReorderExample {
	int a = 0;
	boolean flag = false;
	public void writer(){
		a = 1;
		flag = true;
	}
	
}
