package ArrayBasic;

import java.util.Scanner;

public class Sort0And1 {
    static void ZeroesAndOnes(int []arr){

        int n = arr.length;
        int Zeroes = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                Zeroes++;
            }
        }
        for(int i =0;i<n;i++){
            if(i<Zeroes){
                arr[i]=0;
            }
            else{
                arr[i]= 1;
            }
        }

    }
    static void PrintArray(int []arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr= new int[size];
        System.out.println("enter "+size+"element");
        for(int i = 0;i<arr.length;i++ ){
            arr[i]=sc.nextInt();}
            System.out.println("before sorting array");
            PrintArray(arr);
            System.out.println("after sorting array");
           ZeroesAndOnes(arr);
           PrintArray(arr);

        }

    }




