package MethodsOfJava;

public class Modifiers {
    public String str_1="radhe radhe";
  void printFromClass(){
      System.out.println("within class"+str_1);
  }
    public static void main(String[] args) {
      Modifiers obj1 = new Modifiers();
        obj1.printFromClass();
        System.out.println(obj1.str_1);

    }
}
