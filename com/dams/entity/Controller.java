package com.dams.entity;
import java.util.Scanner;
public class Controller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id ");

        int a1 = sc.nextInt();
        System.out.println("enter name ");


        String a2 = sc.next();
        Employee e1 = new Employee();

        e1.setId(a1);
        e1.setName(a2);

        System.out.println(e1.getId());
        System.out.println(e1.getName());




    }
}
