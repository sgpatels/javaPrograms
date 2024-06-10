package Loops;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b=1,c=0;
        System.out.println("enter number ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            System.out.println(a);
            a=b+c;
            b=c;
            c=a;
        }

    }
}
