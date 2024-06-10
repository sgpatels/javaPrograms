package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int Fibo(int n)
    {
     if(n==0||n==1){
         return n;
     }
        return Fibo(n-1)+Fibo(n-2);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Fibo(i));
       }
        System.out.println(Fibo(5));
    }
}
