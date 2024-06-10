package Recursion;

import java.util.Scanner;

public class NaturalNumberDecreasing {
    static void PrintDecreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        PrintDecreasing(n);
    }
}
