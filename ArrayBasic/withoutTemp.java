package ArrayBasic;

public class withoutTemp {
    static void swap(int a,int b){
        System.out.println("before swap value");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a= a+b;
        b = a-b;
        a = a-b;
        System.out.println("after swapping ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a,b);
    }

}
