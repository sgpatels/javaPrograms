package ArrayBasic;

import java.util.Scanner;

public class SortArrayByParity {

    static void swapInArray(int []arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }


    static void printArray(int[] arr )
    {
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println( );
    }


    static void SortArrayByParity(int []arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr,left,right);
            } else if (arr[left]%2==0) {
                left++;

            }
            else if(arr[right]%2==1){
                right --;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");


        int size = sc.nextInt();
        int []arr = new int[size];


        System.out.println("enter " + size + "element");

        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println("before sorting");
        printArray(arr);

        System.out.println("after sorting");

        SortArrayByParity(arr);
        printArray(arr);

    }


}
