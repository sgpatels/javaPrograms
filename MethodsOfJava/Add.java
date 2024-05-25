package MethodsOfJava;

import java.util.Scanner;

class Algebra {
    int a,b;
    Algebra(int x,int y){
        System.out.println("constructor calling");
        a=x;
        b=y;
    }
    int add()
    {
        return a+b;
    }

    int sub(){
     return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }


 int add(int a,int b){
     int ans = a+b;
     return ans;
 }

}

public class Add {
    public static void main(String[] args) {
        Algebra obj = new Algebra (6,7);// default constructor
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number");
//        int x = sc.nextInt();
//        System.out.println("enter second number ");
//        int y = sc.nextInt();
//        System.out.println("sum is = ");
//       int sum =  obj1.add(x,y);// parameterized constructor
//        System.out.println(sum);
//        System.out.println("sum is ");
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());


    }
}
