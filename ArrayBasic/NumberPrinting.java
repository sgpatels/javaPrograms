package ArrayBasic;

import java.util.Scanner;

public class NumberPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("enter numbers ");
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("printing numbers");
            System.out.println(arr[i]);
        }
    }
}
