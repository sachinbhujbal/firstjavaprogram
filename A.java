package TypeCasting;

public class A {
	// to convert data type from one to another
	
	public static void main(String[] args) {
		int x = 10;
		double y = x; //implicit type casting
		// Widening
		
		
		
		double z=12.5;
		int c = (int) z; // explicit type casting
		//narrowing
		
		// not primitive type casting
//		1. Upcasting
//		2. downcasting 
		
		Person p = new Teacher(); // upcasting
		p.display();
		
		Teacher t = (Teacher) new Person();
		t.display(); //compile error
		
		System.out.println(y +" " + c );
		
	}
}
