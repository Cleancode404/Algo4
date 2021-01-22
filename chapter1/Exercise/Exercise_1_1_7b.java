/**exercise 1.1.7 b**/
/**part b is sum up i and j until i is 1000 */
public class Exercise_1_1_7b{
    public static void main(String[] args){
        int sum = 0;
        for (int i= 1; i < 1000; i++){
            for(int j = 0; j < i; j++){
                sum++;
        System.out.println(sum);
            }

        }
    }
}