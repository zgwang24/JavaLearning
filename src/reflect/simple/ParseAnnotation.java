package reflect.simple;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class ParseAnnotation {
	public static void main(String[] args) {
		Record record = new Record();
		Class recordC = record.getClass();
		// 构造方法部分
		Constructor[] constructors = recordC.getDeclaredConstructors();
		for(int i = 0; i < constructors.length; i++){
			Constructor constructor = constructors[i];
			if(constructor.isAnnotationPresent(Constructor_Annotation.class)){
				Constructor_Annotation ca = (Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
				System.out.println(ca.value());
			}
			Annotation[][] parameters = constructor.getParameterAnnotations();
			for(int j = 0; j < parameters.length; j++){
				int length = parameters[j].length;
				if(length == 0){
					System.out.println("no parameter annotation");
				}else{
					for(int k = 0; k < length; k++){
						Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameters[j][k];
						System.out.print(pa.describe() + " ");
						System.out.println(pa.type());
					}
				}
			}
		}
	}
}
