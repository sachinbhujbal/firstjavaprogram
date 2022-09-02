import java.util.Random;
import java.util.Scanner;

public class random_no_generator {
   public static void main(String[] args) {
       Random r=new Random();
       Scanner s=new Scanner(System.in);
       int b=5;
        int rand=r.nextInt(4);
        System.out.println(rand);
        int guess=s.nextInt();
        while(b>=1){
        if(guess==rand){
            System.out.println("COreect");
            break;
        }else{
            System.out.println("fuck off");
            b--;
            continue;
        }
    }
   }
}
