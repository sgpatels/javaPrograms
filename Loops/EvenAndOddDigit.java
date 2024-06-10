package Loops;
import java.util.Scanner;
public class EvenAndOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int c1=0,c2=0;
        int a;
        while(n>0)
        {
            a = n%10;
            if(a%2==0){
                c1++;
            }
            else{
                c2++;
            }
            n=n/10;
        }
        System.out.println("even digit = "+c1);
        System.out.println("odd digit = "+c2);
    }
}
