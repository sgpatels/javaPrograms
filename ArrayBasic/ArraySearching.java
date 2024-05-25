package ArrayBasic;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5,6,7};
        System.out.println("enter number which you want");
        int num = sc.nextInt();
        boolean isFound=isFound(arr,num);
   if(isFound){
       System.out.println("number is found");
   }
   else{
       System.out.println("number is not found");
   }
    }
    public static boolean isFound(int []arr,int num){
    for( int i=0;i<=arr.length;i++){
        if(arr[i]==num){
            return true;
        }
    }

        return false;
    }

}
