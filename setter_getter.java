import java.util.Scanner;

// import java.util.jar.Attributes.Name;

class setget{
    private String name;
    public int salary;
     public  void setName(String n){
         name=n;
     }
     public  String getName(){
         return name;
     }
     public  void setSalary(int s){
         salary=s;
     }
     public  int getSalary(){
         return salary;
     }
}
public class setter_getter {
    int sal;
  static void no(){
      System.out.println("hellw");
  }
  static int yea(){
      return 99;
  }
  static int major(int s){
      return s;
  }
   public static void main(String[] args) {
      setget s=new setget();
       s.setName("sachin");
       System.out.println("your name is :"+s.getName());
       setter_getter s1=new setter_getter();
       s1.no();
     System.out.println( s1.yea()); 
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println("here"+s1.major(a));
    s.salary=78;

System.out.println("there is salary:"+s.getSalary());
// s.salary=9956;
System.out.println("there:"+s.getSalary());
       
   } 
}
