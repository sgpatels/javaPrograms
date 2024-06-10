package BasicsOfJava;

public class Percentageandavg {
    public static void main(String[] args) {

        float eng=58,che=77,maths=78,hindi=55,sanskrit=99;
        float avg,per;
        avg=(che+eng+maths+hindi+sanskrit)/5;
        per=(eng+maths+che+hindi+sanskrit)/500*100;
        System.out.println("avg is "+avg);
        System.out.println("percentage is "+per);

    }
}
