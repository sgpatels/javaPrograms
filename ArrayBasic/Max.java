package ArrayBasic;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i = 0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int max =0;
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("max = "+max);
    }
}
