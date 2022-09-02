package ExpressionHandaling;

public class ExpectionDemo {
	public static void main(String[] args) {
		
		try {
		int x = 10;
		int y = 0;
			int result = x/y;
			System.out.println(result);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Expection : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Expection : "+e);
		}
		
		finally {
			System.out.println("Vai jani nah ki vul hocie");
		}


		System.out.println("Last line of the program");
		
		//Another
		
		try {
			int [] a = new int[4];
			a[4] = 5;
			
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Expection : "+e1);
		}
		catch(Exception e2) {
			System.out.println("Expection : "+e2);
		}
		finally {
			System.out.println("Last line of the program");
		}
		
		
		
	}
}
