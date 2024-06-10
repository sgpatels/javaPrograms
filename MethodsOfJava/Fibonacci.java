package MethodsOfJava;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        Fibonacci(n);
    }
    public static void Fibonacci(int n){
        int a=0,b=1,c=0;
        for(int i = 1;i<=n;i++)
        {
            System.out.println(a);
            a= b+c;
            b=c;
            c=a;
        }
    }

}
