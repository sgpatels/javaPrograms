package ArrayBasic;

import java.util.Scanner;

class firstRepeatingNumber {
    public static int firstRepeatingNumber(int[]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }



        return -1;

    }


     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array");
         int  size = sc.nextInt();
         int []arr = new int[size];
         System.out.println("ente "+size + "element");
         for(int i =0;i< arr.length;i++){
             arr[i]= sc.nextInt();
         }
         System.out.println("repeating number ="+firstRepeatingNumber(arr));

     }
}
