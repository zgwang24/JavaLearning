package annotation.blog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BlogDemoReflect {
	public static void main(String[] args) {
		BlogDemo bd = new BlogDemo("test");
		Class bdC = bd.getClass();
		// ��·��
		Package packageUrl = bdC.getPackage();
		System.out.println(packageUrl);
		// ������
		String className = bdC.getName();
		System.out.println(className);
		// �̳���
		Class classObj = bdC.getSuperclass();
		System.out.println(classObj);
		// ʵ�ֽӿ�
		Class[] interfaceObjs = bdC.getInterfaces();
		
		// Ȩ��Ϊpublic���췽��
		Constructor[] constructors = bdC.getConstructors();
		// ���й��췽��
		Constructor[] allConstructors = bdC.getDeclaredConstructors();
		
		// Ȩ��Ϊpublic����
		Method[] methods = bdC.getMethods();
		// ���з���
		Method[] allMethods = bdC.getDeclaredMethods();
		
		// Ȩ��Ϊpublic�ĳ�Ա����
		Field[] fields = bdC.getFields();
		// ���г�Ա����
		Field[] allFields = bdC.getDeclaredFields(); 		
	}	
}
