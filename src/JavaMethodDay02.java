///Basic (Methods)
///A5
public class JavaMethodDay02 {

    static void calculateCel(int f) {

        double c = (f - 32) * (5.0 / 9.0);
        System.out.println(c);
    }

    static void calculateF(int c) {

        double f = c * (9.0 / 5.0) + 32 ;
        System.out.println(f);
    }



    public static void main(String[] args) {
        calculateCel(40);
        calculateCel(50);
        calculateCel(60);
    }


}




