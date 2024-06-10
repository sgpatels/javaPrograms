package MethodsOfJava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        long ans = fact(num);
        System.out.println("factorail is = " +ans);
    }
    public static long fact(int n){
        long f = 1,i;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

}
