package TwoDimensionalArray;

import java.util.Scanner;

public class sumOfTwoDimensionalArray {
    static void PrintMatrix(int [][]arr){
        for (int i =0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
    static void Add(int[][]a,int r1,int c1,int [][]b,int r2,int c2){
        if(r1 != r2||c1!=c2){
            System.out.println("wrong matrix");
            return;
        }
        int [][]sum = new int[r1][c1];
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of the matrix ");
         PrintMatrix(sum);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and columns for matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();


        int [][]a = new int[r1][c1];
        System.out.println("enter " + (r1*c1 )+ " element");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("enter row and columns for matrix 2");
        int d2= sc.nextInt();
        int c2 = sc.nextInt();

        int [][]b = new int[d2][c2];
        System.out.println("enter " + (d2*c2) + " element");
        for(int i= 0;i<d2;i++){
            for(int j = 0;j<c2;j++){
                b[d2][c2]= sc.nextInt();

            }
        }

        System.out.println(" matrix 1 = ");
        PrintMatrix(a);
        System.out.println("matrix 2 =");
        PrintMatrix(b);

       Add(a,r1,c1,b,d2,c2);

//        PrintArray(arr);


    }


}
