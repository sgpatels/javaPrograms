package ArrayBasic;

import java.util.Scanner;

public class StrictlyGraterNumber {

    static int StrictlyGraterNumber(int []arr,int x){

        int lastindex = -1;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>x){
                lastindex = i;
            }
        }
        return lastindex;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();
        int []arr= new int[size];
        System.out.println("enter "+size+"element ");
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("enter number which you want to compare");
        int x = sc.nextInt();
        System.out.println(StrictlyGraterNumber(arr,x));


    }




}
