package MethodsOfJava;

import java.util.Scanner;

class ReverseADigit {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number ");
         int num = sc.nextInt();
         int ReverseADigit = ReveseADigit(num);
         System.out.println("reverse digit = "+ReverseADigit);
     }
     public static int ReveseADigit(int num){
         int rev=0,r;
         while(num>0){
             r=num%10;
             rev=(rev*10)+r;
             num/=10;
         }
         return rev;
    }
}
