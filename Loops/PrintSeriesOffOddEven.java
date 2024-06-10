package Loops;
import java.util.Scanner;
public class PrintSeriesOffOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i=i+2)
        {
            System.out.println("even number = "+i);
        }
        for(int j=1;j<=n;j=j+2)
        {
            System.out.println("odd number ="+j);
        }
    }
}
