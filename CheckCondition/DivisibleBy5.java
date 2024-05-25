package CheckCondition;
import java.sql.SQLOutput;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%5==0)
        {
            System.out.println("number is divisible by 5");

        }
        else {
            System.out.println("number does not divisible ny 5");
        }


    }
}
