package ArrayBasic;

import java.util.Arrays;
import java.util.Scanner;

public class occ {
    static int[] smallestAndLargestElement(int[]arr){
       Arrays.sort(arr);
       int [] ans = {arr[0],arr[arr.length-1]};

//     for(int i = 0;i< arr.length;i++){
//         System.out.println(arr[i]);
//     }

     return ans;
    }


    static boolean isSorted(int []arr){
        boolean check = true;
        for(int i =1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        return check;


    }







    static int lastOccurrence(int []arr,int x){
       int last= -1;
       for(int i =0;i< arr.length;i++)
       {
           if(arr[i]==x){
               last = i;
           }
       }

     return last;

    }

    static int countOccurrences(int []arr,int x){
        int count = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]==x){
                count++;
            }

        }
        return count;
    }
    static int strictlyGreater(int []arr,int x){
        int count = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]>x){
                count++;
            }

        }
        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("enter the number which you count ");
//        int x = sc.nextInt();
//        System.out.println("count of x "+countOccurrences(arr,x));

//
//        System.out.println("strictly grater than number = "+strictlyGreater(arr,x));
//        System.out.println("is sorted "+isSorted(arr));
         int []ans = smallestAndLargestElement(arr);
        System.out.println("smallest "+arr[0]);
        System.out.println("largest "+arr[1]);
    }
}
