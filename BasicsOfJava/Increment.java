package BasicsOfJava;

public class Increment {
    public static void main(String[] args) {
        int x=5;
//        System.out.println(x++);// 5 x++ pahle kam karo fir update karo
        System.out.println(x); //5
        x++;// x=x+1 5 se badh gai
        System.out.println(x);//6
        ++x;// ek aur badh jayegi ++x pahle update karo fir kam karo
        System.out.println(x);//7
        x--;
        System.out.println(x);//6
        --x;
        System.out.println(x);//5
    }
}
