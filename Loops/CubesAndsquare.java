package Loops;
import java.util.Scanner;
public class CubesAndsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println("cubes are ="+(i*i*i) );
        }
        for(i=1;i<=n;i++)
        {
            System.out.println("square are ="+(i*i) );
        }

    }
}
