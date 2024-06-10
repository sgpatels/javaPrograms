package ArrayBasic;

import java.util.Scanner;

public class TakeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string size");
        int size = sc.nextInt();
        String arr[]=new String[size];
        for(int i =0;i< arr.length;i++)
        {
            System.out.println("enter name ");
            arr[i]=sc.next();
        }
        for(int i = 0;i< arr.length;i++)
        {
            System.out.println("here the name of student ");
            System.out.println(arr[i]);
        }
    }
}
