package CheckCondition;
import java.util.Scanner;
public class ThreeFiveNotFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0 && n % 15 != 0) {
//            if(n%15 !=0)
//
//        {
//            System.out.println("divisible by 5 and 3 but not 15");
//        }
//       else {
//                System.out.println("not matching the condition");}
//    }
//    }
            System.out.println("divisible by 5 and 3 but not 15");


        }
    }
    }