package CheckCondition;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter ther number ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the number you entered is even");
        }
        else {
            System.out.println("odd number");
        }



    }





}
