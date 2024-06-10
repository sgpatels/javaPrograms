package ArrayBasic;

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        System.out.println("welcome to array occurrences");
        Scanner sc = new Scanner(System.in);
        int [] numArray = ArrayUtility.inputArray();
        System.out.println("enter the number you want to find");
        int num = sc.nextInt();
        int occurrences=noOfOccurrences(numArray,num);
        System.out.println("your number is found "+occurrences+"times in the array");

    }
    public static int noOfOccurrences(int []numArr, int num ){
     int occ=0;
     int i =0;
     while(i<numArr.length)
     {
         if(numArr[i]==num){
             occ++;
         }
         i++;
     }
       return occ;
    }
}
