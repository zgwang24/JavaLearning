package annotation.blog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BlogDemoReflect {
	public static void main(String[] args) {
		BlogDemo bd = new BlogDemo("test");
		Class bdC = bd.getClass();
		// 包路径
		Package packageUrl = bdC.getPackage();
		System.out.println(packageUrl);
		// 类名称
		String className = bdC.getName();
		System.out.println(className);
		// 继承类
		Class classObj = bdC.getSuperclass();
		System.out.println(classObj);
		// 实现接口
		Class[] interfaceObjs = bdC.getInterfaces();
		
		// 权限为public构造方法
		Constructor[] constructors = bdC.getConstructors();
		// 所有构造方法
		Constructor[] allConstructors = bdC.getDeclaredConstructors();
		
		// 权限为public方法
		Method[] methods = bdC.getMethods();
		// 所有方法
		Method[] allMethods = bdC.getDeclaredMethods();
		
		// 权限为public的成员变量
		Field[] fields = bdC.getFields();
		// 所有成员变量
		Field[] allFields = bdC.getDeclaredFields(); 		
	}	
}
