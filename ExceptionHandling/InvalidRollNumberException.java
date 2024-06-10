package ExceptionHandling;

import java.util.Scanner;

public class InvalidRollNumberException extends RuntimeException {
    InvalidRollNumberException (String x){
                super(x);

    }
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.next();
        InvalidRollNumberException x = new InvalidRollNumberException(name);

    }
}
