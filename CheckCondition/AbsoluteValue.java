package CheckCondition;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for check absolute value");
        int n = sc.nextInt();
        if(n<0)
        {
            n=n*(-1);
            System.out.println("absolute value is "+n);
        } else if (n>0) {
            System.out.println("absolute value is "+n);

        }
        else {
            System.out.println("good morning");
        }


    }
}
