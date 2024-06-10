package TwoDimensionalArray;

import java.util.Scanner;

public class Multiplication {

    static void Multiply(int[][]a,int r1,int c1,int [][]b,int r2,int c2){

       if(c1!=r1){
           System.out.println("wrong answer");
           return;
       }
       int [][]mul = new int[r1][c2];
       for(int i =0;i<r1;i++){
           for(int j =0;j<c2;j++){
               for(int k =0;k<c1;k++){
                   mul[i][j]+=a[i][k]+b[k][j];
               }
           }
       }

        System.out.println("multiplication is = ");
       PrintMatrix(mul);

    }

    static void PrintMatrix(int [][]arr){
        for(int i =0;i< arr.length;i++){
            for(int j = 0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter row and column for matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][]a= new int[r1][c1];
        System.out.println("enter "+(r1*c1)+" element");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter element for matrix b");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][]b = new int[r2][c2];
        System.out.println("enter "+ (r2*c2)+ " element");
        for (int i =0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 1 ");
        PrintMatrix(a);
        System.out.println("matrix 2");
        PrintMatrix(b);
        Multiply(a,r1,c1,b,r2,c2);
    }
}
