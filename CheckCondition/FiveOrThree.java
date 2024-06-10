package CheckCondition;
import java.util.Scanner;
public class FiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        if(n%3==0|| n%5==0)
        {
            System.out.println("number is divisible by 5 or three");

        }
        else {
            System.out.println("number does not divisible by 5 or 3");
        }
    }
}
