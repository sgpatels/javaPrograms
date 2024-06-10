package com.dams.entity;

public class Teacher {
    public int teachingClass;         //public modifiers
   private int id;                     // private access modifiers
    String degree;

    //default modifiers
  protected int studentCount;
  protected String name;
    public static void main(String[] args) {


        Teacher t1 = new Teacher();
        t1.teachingClass = 12;
        t1.id = 123;
        t1.degree = "BCA";


// Default modifiers is used in same package and all its classes inside the package

}
}
