package com.dams.Pack2;

import com.dams.entity.Teacher;

public class MainInPackage2 extends Teacher{
    public static void main(String[] args) {
        Teacher obj = new Teacher();
//        obj.id = 123; this is private
        obj.teachingClass=5;
//        obj.degree = "ba"; because it is default
        MainInPackage2 mainInPackage2 = new MainInPackage2();
        mainInPackage2.studentCount=100;
        mainInPackage2.name= "abhi";
        // it is protected so we access outside the package
        System.out.println(mainInPackage2.name);
    }
}
