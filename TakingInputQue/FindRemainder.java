package TakingInputQue;
import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend ");
        int a= sc.nextInt();
        System.out.println("enter divisor");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.println("remainder is ");
        System.out.println(r);

    }
}
