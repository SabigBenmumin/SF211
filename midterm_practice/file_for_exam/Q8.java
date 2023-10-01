import java.text.DecimalFormat;
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // 1. read numbers of shots and made shots
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of shots: ");
        int numShots = scan.nextInt();
        System.out.print("Enter number of shots made: ");
        int numShotsMade = scan.nextInt();

        // 2. display percent of shots made
        DecimalFormat formatter = new DecimalFormat("#.0%");
        System.out.println("Percent shots made = " 
                + formatter.format((double) numShotsMade / numShots));
    }

}
