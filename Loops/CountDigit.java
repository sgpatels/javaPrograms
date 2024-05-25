package Loops;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for counting");
        int n = sc.nextInt();
        int c = 0;
        while (n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println("total digit = "+c);
    }
}
