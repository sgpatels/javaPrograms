package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("hello 1");
//        int a = 5;
//        int b = 0;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        try {
//            int a = Integer.parseInt(args[0]);
//            int b = Integer.parseInt(args[1]);
            System.out.println(c / d);

        } catch (ArithmeticException obj1) {
            System.out.println("please enter a non zero number");
        } catch (InputMismatchException obj1) {
            System.out.println("please enter a integer value");

       }
//        catch (ArrayIndexOutOfBoundsException obj1){
//            System.out.println("please enter 2 values");
//        }
            System.out.println("hello2");
            System.out.println("hello 3");
            System.out.println("hello 3");
        }
    }

