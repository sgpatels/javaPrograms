package CheckCondition;
import java.util.Scanner;
public class CheckTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n>9 && n<100)
        {
            System.out.println("it is a two digit number");
        } else {
            System.out.println("it is not a two digit number");
        }
    }
}
