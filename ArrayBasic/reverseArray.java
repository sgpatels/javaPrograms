package ArrayBasic;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter element");
        for(int i=0;i< arr.length;i++ )
        {
            arr[i]=sc.nextInt();
        }
        int n= arr.length;
        System.out.println("reverse of array ");
        for(int i = n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
