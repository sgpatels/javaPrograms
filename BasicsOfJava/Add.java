package BasicsOfJava;

public class Add {

    int num1;
    static int num2;
   static void sum(){
       Add obj1 = new Add();
       obj1.num1=10;
        num2=20;
      int sum = obj1.num1+num2;
       System.out.println("sum = "+sum);
//       System.out.println(obj2.num1);
//       System.out.println(num2);
    }
    void sub(){
      Add obj3 = new Add();
       obj3.num1=20;
       num2  = 30;
       int sub = obj3.num1-num2;
        System.out.println("substraction ="+ sub);

    }


    public static void main(String[] args) {
        Add obj1=new Add();
        Add.sum();
        Add obj3 = new Add();
        obj3.sub();
    }
}
