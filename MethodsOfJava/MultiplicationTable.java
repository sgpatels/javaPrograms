package MethodsOfJava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome two multiplication world");
        System.out.println("enter number");
        int num = sc.nextInt();
        printMultiplication(num);

    }
    public static void printMultiplication(int n){
     for(int i = 1;i<=10;i++){
         System.out.println(n+" x "+i+"= "+(n*i));
     }


    }
}
