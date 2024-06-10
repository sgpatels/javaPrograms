package ArrayBasic;

import java.util.Scanner;

public class SecondMethod0And1 {
    static void Swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void PrintArray(int []arr){
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void Sorting(int []arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        for(int i =0;i<n;i++){
            if(arr[left]==1 && arr[right] ==0 ){
                Swap(arr,left,right);
            }
           else if(arr[left]==0){
                left++;
            }
          else  if(arr[right]==1){
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
        PrintArray(arr);
        System.out.println("after sorting ");
        Sorting(arr);
        PrintArray(arr);
    }


}
