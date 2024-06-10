package Loops;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number which yow want to test ");
        int n = sc.nextInt();
        int i,flag=0;
        for(i=2;i<n;i++) {
            if (n % i == 0) {
                flag = 1;
                break;

            }
        }
        if(flag ==0)
        {
            System.out.println("prime");
        }

        else {
            System.out.println("not prime");
        }
    }
}
