package MethodsOfJava;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println("number is prime");
        }
        else {
            System.out.println("not prime");
        }

    }
    public static boolean isPrime(int n){
        int i ;
        for(i= 2 ;i<n;i++){
            if (n%i==0){
                return false;
            }
        }

    return true;

    }

}
