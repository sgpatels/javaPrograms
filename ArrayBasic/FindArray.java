package ArrayBasic;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int []arr=new int[size];

        for(int i =0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number which you want to search");
        int n = sc.nextInt();
        int flag =0;
        for(int i = 0;i< arr.length;i++)
        {

            if(arr[i]==n){
                flag=1;
                break;
            }


        }
        if(flag==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
