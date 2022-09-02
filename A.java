package ExpressionHandaling;

import java.io.File;

public class A {
	
	// expection handaling
	// - Runtime Error means expection
	
	int x = 10;
	int y = 0;
	 int z=  x / y; 
//	 Arithmetic expection
	 
	 String name = null;
	 char name2 =  name.charAt(0);
	 //Null pointer expection
	 
	 String name3 = "Dipraj";
	 char name4 = name3.charAt(9);
	 // String Index Out Of Bounds Expection
	 
	 int num = Integer.parseInt("DIPURAJ");
	 // NumberFormet expection
	 
	 File file  = new File("../..///");
	 //File not Found expection
	 
	 int[] a = new int[5];
	 a[5] = 32;
	 //Array INdex Out of bOund expection
	 
	// What is expection handling
	 // Handling runtime ERROR
	 
//	 try
//	 catch
//	 finally
//	 throw
//	 throws
	 //this keywords are used to handle expection
	 
	 try {
		 
		 //code you want to monitor
//		 or maybe the code can show expection error
		 //if any expection will have found than try will throw it to the FIRST CATCH
	 }
	 catch( /* expection type e1 */ ) {
		 //Exception handler for expection
	 }
	 catch( /* expection type e2 */ )
	 {
		 //Exception handler for expection	 //Exception handler for expection
	 }
	 finally {
		 // block of code to be executed after try block
	 }
	
	
}
