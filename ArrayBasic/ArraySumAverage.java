package ArrayBasic;

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("welcome two array sum avg");
    int []numArray = ArrayUtility.inputArray();
    long sum = sum(numArray);
    long avg = average(numArray);
        System.out.println("sum = "+sum);
        System.out.println("average = "+avg);
      }
      public static long sum(int [] numArray){
        long sum=0;
        for(int i =0;i<numArray.length;i++){
            sum+=numArray[i];
        }
        return sum;
      }
     public static long average(int [] numArray){
       long sum = sum(numArray);

        return (sum/numArray.length);
     }

    }

