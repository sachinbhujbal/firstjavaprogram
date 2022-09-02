package LinkedList;

public class StudentList {
	
	String name ,className;
	int id;
	
	StudentList(int id, String name, String className){
		this.id = id;
		this.name = name;
		this.className = className;
		
	}

	@Override
	
	public String toString(){
		return "ID : " +  id + ", Name : " + name + ", Class : " + className;
	}
	
	
}
