package MethodsOfJava;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = Sum(num);
        System.out.println("sum " + sum);
    }
    public static int Sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i = i + 2) {
            sum = sum + i;}
            return sum;

    }
}
