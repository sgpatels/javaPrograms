package ArrayBasic;

import java.util.Scanner;

public class ArrayUtility {
    public static int[]inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("enter element::" + (i + 1) + " ; ");
            nums[i] = sc.nextInt();
            i++;

        }
        return nums;
    }
}
