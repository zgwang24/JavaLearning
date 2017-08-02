package reflect.simple;

import java.lang.reflect.Constructor;

public class TestField {
	public TestField(){
		
	}
	public TestField(int i){
		
	}
	public static void main(String[] args) {
		TestField testField = new TestField();
		Class testFieldC = testField.getClass();
		System.out.println(testFieldC.getPackage());
		System.out.println(testFieldC.getName());
		System.out.println(testFieldC.getSuperclass());
		for(Constructor c : testFieldC.getConstructors()){
			System.out.print(c.getParameterCount()+ " ");
		}
	}
}
