package reflect;

public class ReflectDemo {
	public static void main(String[] args) {
		String s = new String();
		Class c = s.getClass();
		System.out.println(c.getPackage());
		System.out.println(c.getName());
	}
}
