package CheckCondition;
import java.util.Scanner;
public class CheckThreeDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        if(n>99 && n <1000)
        {
            System.out.println("this is a three digit number");
        }
        else{
            System.out.println("this is not a three digit number");
        }
    }
}
