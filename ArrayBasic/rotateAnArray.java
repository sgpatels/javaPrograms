package ArrayBasic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rotateAnArray {


   public static void printArray(int[] arr )
    {
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println( );
    }

    static int[] rotate(int []arr,int k){
     int n = arr.length;
     k = k%n;
     int []ans = new int[n];
     int j = 0;
    for(int i =n-k;i<n;i++){
        ans[j++]=arr[i];
    }
    for(int i =0;i<n-k;i++){
        ans[j++]=arr[i];
    }

    return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter "+ size + " element");
        for(int i =0;i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter kth element ");
        int k = sc.nextInt();

        System.out.println("original array");
        printArray(arr);

         int []ans = rotate(arr,k);
        System.out.println("array after rotation");
        printArray(ans);



    }









}
