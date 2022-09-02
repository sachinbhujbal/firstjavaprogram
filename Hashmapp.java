package Hashmap;

import java.util.HashMap;

public class Hashmapp {
	public static void main(String[] args) {
		
		HashMap<Integer, String> customar = new HashMap<Integer, String>();
		
		//put get
		customar.put(101, "Dipraj");
		customar.put(102, "Sunu");
		customar.put(130, "Anu");
		
		
		System.out.println(customar.get(102));
		
	}
}
