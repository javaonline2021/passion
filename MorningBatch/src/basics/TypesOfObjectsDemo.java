package basics;

public class TypesOfObjectsDemo {
	
	String str = "java";

	public static void main(String[] args) {
		
		// Type :1 using new 
		
		TypesOfObjectsDemo obj = new TypesOfObjectsDemo();
		
		System.out.println("variable copy :"+obj.str);
		
		
		// Type 2:
		
		
		try
        { 
            Class<?> cls = Class.forName("basics.TypesOfObjectsDemo"); 
            TypesOfObjectsDemo obj1 = 
                    (TypesOfObjectsDemo) cls.newInstance(); 
            System.out.println("NewInstance:"+obj1.str); 
        } 
        catch (ClassNotFoundException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (InstantiationException e) 
        { 
            e.printStackTrace(); 
        } 
        catch (IllegalAccessException e) 
        { 
            e.printStackTrace(); 
        } 
		
		

	}

}
