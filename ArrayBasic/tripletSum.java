package ArrayBasic;

import java.util.Scanner;

class tripletSum {

     public static int triplet(int arr[],int target){
         int ans =0;
         for(int i =0;i<arr.length;i++){
             for(int j=i+1;j< arr.length;j++)
             {
                 for(int k = j+1;k<arr.length;k++){
                     if(arr[i]+arr[j]+arr[k]==target){
                         ans++;
                     }
                 }
             }


         }


         return ans;


     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array");
         int size = sc.nextInt();
         int []arr = new int[size];
         System.out.println("enter "+size+"element ");
         for(int i = 0;i< arr.length;i++){
             arr[i]= sc.nextInt();
         }
         System.out.println("enter target value");
         int target =sc.nextInt();
         System.out.println(triplet(arr,target));
     }











}
