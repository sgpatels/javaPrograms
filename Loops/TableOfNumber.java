package Loops;
import java.util.Scanner;
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {

            System.out.print(n+"*"+i);
            System.out.println("="+n*i);

        }
    }
}
