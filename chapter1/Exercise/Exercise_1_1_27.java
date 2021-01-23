

public class Exercise_1_1_27 {
    public static void main(String[] args){
        public static double binomial(int N, int k, double p)
        {
            if ((N == 0) || (k < 0)){
                return 1.0;
            }
            return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1);
        }
    }
    
}


