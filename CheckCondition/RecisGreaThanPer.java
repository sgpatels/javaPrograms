package CheckCondition;
import java.util.Scanner;
public class RecisGreaThanPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        System.out.println("enter width");
         int w = sc.nextInt();
         int p = 2*(l+w);
        System.out.println("perimeter is "+p);
         int area = l*w;
        System.out.println("area is "+area);
         if(p>area)
         {
             System.out.println("perimeter is greater than the area");
         }
         else if ( p<area)
         {
             System.out.println("area is greater than the perimeter");
         }
    else {
             System.out.println("perimeter is equal to area ");
         }
    }
}
