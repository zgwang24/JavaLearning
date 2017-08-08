package reflect.constructor;

import java.lang.reflect.Constructor;

public class ParseConstructor {
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		Class c = cd.getClass();
		Constructor[] constructors = c.getDeclaredConstructors();
		for(int i = 0; i < constructors.length; i++){
			Constructor constructor = constructors[i];
			System.out.println("是否有参数：" + constructor.isVarArgs());
			System.out.println("参数类型：");
			Class[] parameterType = constructor.getParameterTypes();
			for(int j = 0; j < parameterType.length; j++){
				System.out.print(" " + parameterType[j]);
			}
		}
	}
}
