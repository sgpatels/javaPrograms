package Loops;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for finding armstrong or not");
        int n = sc.nextInt();
        int s=0,r;
        int t = n;
        while(n>0)
        {
            r = n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(t==s){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("this is  not a  armstrong");
        }
    }
}
