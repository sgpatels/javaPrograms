package CheckCondition;
import java.util.Scanner;
public class LieOnAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        if(x==0 && y==0 ){
            System.out.println("the point is origin");
        }
        else if (x==0)
        {
            System.out.println("they lies on y axis");
        }
        else if (y==0)
        {
            System.out.println("they are lies in x axis");
        }
    }
}
