package MethodsOfJava;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int a = readNumber()+1;
        int b = readNumber()+2;
         int  sum = a+b;
        System.out.println("sum = "+sum);
    }
    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int number= sc.nextInt();
        return number;
    }

    public static void greet(){
        System.out.println("good morning");
    }
}
