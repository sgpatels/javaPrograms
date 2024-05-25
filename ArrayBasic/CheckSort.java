package ArrayBasic;

import java.util.Scanner;

public class CheckSort {

    static Boolean isSorted(int []arr){
        boolean p = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                p = false;
                break;
            }
        }

        return p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter "+ size + "element");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(isSorted(arr));

    }





}
