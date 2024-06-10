package MethodsOfJava;

import java.util.Scanner;

 class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        int Lcm = Lcm(first,second);
        System.out.println("lcm = "+Lcm);

    }
    public static int Lcm(int first,int second){
    int i = 1;
    while(i<=second){
        int factor = first *i;
        if(factor%second ==0) {
        return factor;}
        i++;
    }
    return 0;//unreachable
    }

}
