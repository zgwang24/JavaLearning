package genericity;

public class GenericTest {
	public static void main(String[] args) {
		/*Box<String> box1 = new Box<String>("corn");
		System.out.println("Box: " + box1.getData());
		
		Box<Integer> box2 = new Box<Integer>(1000);
		System.out.println("Box: " + box2.getData());
		
		System.out.println(box1.getClass());
		System.out.println(box1.getClass() == box2.getClass());*/
		
		// ¿‡–ÕÕ®≈‰∑˚
		Box<String> box1 = new Box<String>("corn");
		Box<Integer> box2 = new Box<Integer>(1000);
		Box<Number> box3 = new Box<Number>(123);
			
		/*getData(box1);
		getData(box2);
		getData(box3);*/
		
		// getNumberData(box1);
		// getNumberData(box2);
		getNumberData(box3);
		
	}
	
	/*public static void getData(Box<?> data){
		System.out.println(data.getData());
	}*/
	
	public static void getNumberData(Box<? super Number> data){
		System.out.println(data.getData());
	}
}
