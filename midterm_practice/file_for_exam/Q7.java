import java.text.DecimalFormat;
import java.util.Random;

public class Q7 {

    public static void main(String[] args) {
        // 1. generate and compute average of 3 random ints between 0 and 50
        Random rand = new Random();
        int total = 0;
        for (int i = 0; i < 3; i++) {
            int num = rand.nextInt(51);
            total += num;
        }
        double average = (double) total / 3;
        // 2. display result
        DecimalFormat formatter = new DecimalFormat("#.0");
        System.out.println("Average is " + formatter.format(average));
    }

}
