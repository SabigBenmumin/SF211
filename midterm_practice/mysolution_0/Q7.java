import java.text.DecimalFormat;
import java.util.Random;

public class Q7 {
    public static void main(String[ ] args){
        Random rand = new Random();
        int sum = 0;
        for(int i = 0; i< 3; i++){
            sum += rand.nextInt(51);
        }
        double average = sum / 3.0;
        DecimalFormat format = new DecimalFormat("0.0");
        System.out.print("Average = " + format.format(average));
    }
}
