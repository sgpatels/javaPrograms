package MethodsOfJava;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        Armstrong(n);

    }
    public static void Armstrong(int n ) {
        int s = 0, r;
        int p = n;
        while (n > 0) {
            r = n % 10;
            s = s + (r * r * r);
            n /= 10;

        }
        if (s == p) {
            System.out.println("armstrong");


        } else {
            System.out.println("not armstrong");
        }
    }
}
