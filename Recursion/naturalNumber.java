package Recursion;
import java.util.Scanner;
public class naturalNumber {
    static void PrintIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        PrintIncreasing(n);
    }
}
