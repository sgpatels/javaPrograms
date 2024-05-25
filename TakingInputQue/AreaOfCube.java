package TakingInputQue;
import java.util.Scanner;
public class AreaOfCube {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter side os a cube ");
        a = sc.nextInt();
         int area=6*a*a;
        System.out.println("area of a cube is "+area);


    }

}
