package TakingInputQue;
import java.util.Scanner;
public class RemainderUsingM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend ");
        int a = sc.nextInt();
        System.out.println("enter divisor");
        int b= sc.nextInt();
        int r= a%b;
        System.out.println("remainder is "+r);

    }
}
