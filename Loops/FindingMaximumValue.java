package Loops;
import java.util.Scanner;
public class FindingMaximumValue {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of student ");
            int n = sc.nextInt();
            int max = 0;
            while(n>0)
            {
                System.out.println("enter marks of student ");
                int marks = sc.nextInt();
                if(marks>max)
                {
                    max=marks;
                }
                System.out.println("maximum number = "+max);
            }

        }
    }


