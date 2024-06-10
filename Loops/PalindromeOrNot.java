package Loops;
import java.util.Scanner;
public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which you want to check ");
        int n = sc.nextInt();
        int rev=0,t,r;
        t=n;
        while(n>0){
            r = n%10;
            rev = (rev*10)+r;
            n=n/10;
        }
        if(t==rev)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
    }
}
