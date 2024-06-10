package CheckCondition;
import java.util.Scanner;
public class EvenAndDivisibleBytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if(n%2==0 && n%3==0)
        {
            System.out.println("even and divisible by three");

        }
    else {
            System.out.println("odd");
        }
    }
}
