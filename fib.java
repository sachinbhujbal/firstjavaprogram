import java.util.Scanner;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class fib {
    public static int fibonaci(int x) {
        if(x==0){
            return 0;
        }
        if (x == 1 || x == 2) {
            return x - 1;
        } else {
            return fibonaci(x - 1) + fibonaci(x - 2);
        }
    }
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the no");
        // int a = scanner.nextInt();
    //    int n=scanner.nextInt();
        // System.out.println(fibonaci(a));
        // for(int i=0; i<n; i++){
        //     for(int j=n; j>=i+1; j--){
        //         System.out.print("&");
        //     }
        //     System.out.println();;
        // }

        Square s=new Square();
        int a=scanner.nextInt();
       s.side=a;
        System.out.println("uour area is"+s.area());


    }
}
