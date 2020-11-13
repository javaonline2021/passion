package basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StuTest {

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		
		System.out.println("Class NAme :"+stu.getClass());
		
		System.out.println("***************************************");
		
		Class c1 = stu.getClass();
		
		Field[] variablesList = c1.getDeclaredFields();
		
		for(Field f : variablesList) {
			
			System.out.println("Student Fields :"+f);
		}
		
		System.out.println("***************************************");
		Method[] methods = c1.getDeclaredMethods();
		
		for(Method m : methods) {
			
			System.out.println("Student Methods :"+m);
		}
		
		System.out.println("***************************************");
		
		Constructor[] con = c1.getDeclaredConstructors();
		
		for(Constructor c : con) {
			
			System.out.println("Student Constructors :"+c);
		}

	}

}
