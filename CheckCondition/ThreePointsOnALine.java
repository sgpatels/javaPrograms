package CheckCondition;
import java.util.Scanner;
public class ThreePointsOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double x1 =1,x2=2,x3=4,y1=4,y2=5,y3=6;
      double m1=(y2-y1)/(x2-x1);
      double m2 = (y3-y2)/(x3-x2);
      if(m1==m2){
          System.out.println("the three points lie on a single line");
      }
      else {
          System.out.println("does not lie");
      }
    }
}
