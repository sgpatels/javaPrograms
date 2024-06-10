package Loops;
import java.util.Scanner;
public class MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student ");
        int n = sc.nextInt();
        double min  =  32767;
        for(int i = 1;i<=n;i++)
        {
            System.out.println("enter marks of student ");
            int marks= sc.nextInt();
            if(min>marks)
            {
                min=marks;
            }

        }
        System.out.println("minimum number = "+min);

    }
}
