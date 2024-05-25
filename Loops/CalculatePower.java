package Loops;
import java.util.Scanner;
public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a = sc.nextInt();
        System.out.println("enter power");
        int b = sc.nextInt();
        int i,r=1;
        for(i=1;i<=b;i++)
        {
            r=r*a;
        }
        System.out.println("power = "+r);

    }
}
