package CheckCondition;
import java.util.Scanner;
public class EnterREct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l= sc.nextInt();
        System.out.println("enter width");
        int w = sc.nextInt();
        if(l==w)
        {
            System.out.println("it is a square");
        }
        else{
            System.out.println("this is not a square");
        }
    }
}
