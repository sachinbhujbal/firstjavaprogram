package LinkedList;

import java.util.LinkedList;

public class LinkEDLIST {
	
	public static void main(String[] args) {
		
		LinkedList<String> countryName = new LinkedList<String>();
		
		countryName.add("Bangladesh");
		countryName.add("India");
		countryName.add("Pakistan");
		countryName.add("China");
		
		countryName.add(4, "Japan");
		countryName.add(5, "Argentina");
		
		countryName.addFirst("USA");
		countryName.addLast("Afganistan");
		
		for(String x : countryName) {
			System.out.println(x);
		}
		
		countryName.remove(5);
		countryName.removeFirst();
		
		
		System.out.println(countryName);
		System.out.println("Size of the list : " + countryName.size());
		
		System.out.println( "5 " + "Element is : "+countryName.get(5));
		
	}
	
	
}
