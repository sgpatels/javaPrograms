package Loops;
import java.util.Scanner;
public class PrintNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number which you want to print");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
