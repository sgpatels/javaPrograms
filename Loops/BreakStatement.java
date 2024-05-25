package Loops;
import java.util.Scanner;
public class BreakStatement {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i = 0;i<=n;i++)
     {
         if(n==5){break;}
         System.out.println(i);
     }
    }
}
