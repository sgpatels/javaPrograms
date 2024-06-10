package CheckCondition;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l= sc.nextInt();
        System.out.println("enter width");
        int w= sc.nextInt();
        int area = l*w;
        System.out.println("area of a rectangle is "+area);
        System.out.println("enter square side");
        int a = sc.nextInt();
        int s = a*a;
        System.out.println("area of a square is "+s);
        if( area== s)
        {
            System.out.println("it is also a square");

        } else  {
            System.out.println("this is a rectangle");

        }
    }
}
