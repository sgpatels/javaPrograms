package CheckCondition;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter year");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }


    }
}
