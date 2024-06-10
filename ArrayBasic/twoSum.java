package ArrayBasic;

import java.util.Scanner;

 class twoSum {

     public static int sum(int []arr,int target) {
         int ans = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 if (arr[i] + arr[j] == target) {
                     ans++;
                 }
             }

         }
         return ans;
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter "+size +"element");
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter target value");
        int target = sc.nextInt();
        System.out.println(sum(arr,target));

    }
}
