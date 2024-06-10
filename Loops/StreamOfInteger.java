package Loops;
import java.util.Scanner;
public class StreamOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=-1)
        {
            sum+=num;
            num = sc.nextInt();
            num++;
        }
       System.out.println(sum);
    }

}
