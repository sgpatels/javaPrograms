package Loops;
import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number which you want two reverse");
        int n = sc.nextInt();
        int r,rev=0;
        while(n>0){
            r = n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println("reverse is = "+rev);
    }
}
