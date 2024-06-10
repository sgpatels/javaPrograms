package ArrayBasic;

import java.util.Scanner;

public class Quaries {

    static int[] Queries(int []arr){

        int []Freq= new int[10005] ;
        for(int i = 0;i< arr.length;i++){
            Freq[arr[i]] = Freq[arr[i]]+1;
        }
        return Freq;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("enter"+ size +"element");
        for (int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter number of queries");
        int q = sc.nextInt();
        int []Freq = Queries(arr);
        while (q>0){
            System.out.println("enter number to be searched");
            int x = sc.nextInt();
            if(Freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

        }
    }









}
