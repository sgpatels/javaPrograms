package MethodsOfJava;

import java.util.Scanner;

public class SumOFDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.println("enter number");
        int num = sc.nextInt();
        int s=DigitSum(num);
        System.out.println("sum = "+s);
    }
    public static int DigitSum(int n )
    {
        int sum = 0;
        int r,i;
        while (n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

}
