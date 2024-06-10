package MethodsOfJava;

import java.util.Scanner;

class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        int Gcd = Gcd(first, second);
        System.out.println("gcd = "+Gcd);
    }

    public static int Gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
      int least = least(first,second);
      while(i<=least){
          if(first % i == 0 && second % i==0){
              gcd = i;
          }
          i++;
      }
        return gcd;
    }

    public static int least(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
 }

