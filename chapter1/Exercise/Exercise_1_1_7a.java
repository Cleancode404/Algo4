/**exercise 1.1.7**/
/**part a is find the square root of a number */
public class Exercise_1_1_7a{
    public static void main(String[] args){
        double t = 9.0;
        while (Math.abs( t - 9.0 /t) > 0.001)
        {
            t = (9.0/t + t)/2.0;
            System.out.printf("%.5f\n", t);
        }
    }
}


