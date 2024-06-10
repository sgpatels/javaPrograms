package ArrayBasic;

public class MethodDemo3 {
    void x1(){
        System.out.println("hello");
    }
   static void x2(){
        System.out.println("bye");
    }

    public static void main(String[] args) {
      MethodDemo3 C =new MethodDemo3();
          C.x1();
          C.x2();
          x2() ;
    }
}
