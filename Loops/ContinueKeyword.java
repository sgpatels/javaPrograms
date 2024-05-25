package Loops;

public class ContinueKeyword {
    public static void main(String[] args) {
        int num ;
        for(num=1;num<=50;num++)
        {
            if(num%3==0){continue;}
            System.out.println("number is "+num);
        }
    }
}
