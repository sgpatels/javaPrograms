package CheckCondition;
import java.util.Scanner;
public class GreatestOfThem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greatest number"+a);

        }
        else if ( b>a && b>c)
        {
            System.out.println("b is greatest number"+b);
        }
        else
        {
            System.out.println("c is greatest number"+c);
        }
    }

}
