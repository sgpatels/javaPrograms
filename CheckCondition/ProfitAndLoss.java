package CheckCondition;
import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = sc.nextInt();
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        if(cp>sp)
        {
            System.out.println("loss"+(cp-sp));
        }
        else if (cp<sp)
        {
            System.out.println("profit"+(sp-cp));
        }

        else {
            System.out.println("neither profit nor loss");
        }

    }


}
