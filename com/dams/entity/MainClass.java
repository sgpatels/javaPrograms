package com.dams.entity;

public class MainClass {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass=4;
//        obj.id=123; this is not accessible because it is private data
        obj.degree = "BCA";   // accessed in another class because it is default modifier
    }
}
