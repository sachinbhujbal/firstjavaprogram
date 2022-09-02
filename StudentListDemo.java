package LinkedList;

import java.util.LinkedList;

public class StudentListDemo {
public static void main(String[] args) {
	// student link list
	
	LinkedList<StudentList> list = new LinkedList<StudentList>();
	
	
	// student create
	
	StudentList s1 = new StudentList(1, "Dipraj", "XI");
	StudentList s2 = new StudentList(2, "Sun", "XII");
	StudentList s3 = new StudentList(3 , "Ayaon", "V");
	StudentList s4 = new StudentList(4, "Avro", "I");
	
	// adding student
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	
	for(StudentList o : list) {
		System.out.println(o);
	}
}
}
