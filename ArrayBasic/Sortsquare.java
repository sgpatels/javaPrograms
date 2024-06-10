package ArrayBasic;

import java.util.Scanner;

public class Sortsquare {
    static void swapInArray(int []arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void reverseArray(int []arr){
        int i =0;int j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }


    }

    static void PrintArray(int[]arr){
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }


    static int[]SortSquare(int[]arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int []ans = new int[n];
        int k =0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
                right--;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right --;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter"+size+"element");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("before ");
        PrintArray(arr);
        int []ans  = SortSquare(arr);
        System.out.println("after sorting");

        PrintArray(ans);
        System.out.println("after reverse");
        reverseArray(ans);
        PrintArray(ans);



    }






}
