package ArrayBasic;

import java.util.Scanner;

class findUnique {
    public static int findUnique(int []arr){


        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]= -1;
                    arr[j]=-1;
                }
            }
        }
     int ans = -1;
        for(int i =0;i< arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans ;


    }












    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("ente "+size+"element");
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("unique element = "+findUnique(arr));

    }
}
