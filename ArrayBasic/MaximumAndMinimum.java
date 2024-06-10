package ArrayBasic;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i = 0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            }

        }


        System.out.println("largest number = "+max);
        System.out.println("smallest number = "+min);
    }
}
