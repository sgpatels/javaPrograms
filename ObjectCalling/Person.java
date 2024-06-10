package ObjectCalling;

 public class Person {
    int rollNo;
    String studentName;

    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.rollNo=20;
        System.out.println(obj1.rollNo);
        obj1.studentName = "abhishek";
        System.out.println(obj1.studentName);
        Person obj2 = new Person ();
        obj2.rollNo = 30;
        System.out.println(obj2.rollNo);
        obj2.studentName = "sahil";
        System.out.println(obj2.studentName);
    }
}
