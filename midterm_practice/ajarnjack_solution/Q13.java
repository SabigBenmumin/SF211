import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) throws FileNotFoundException {
        // 1. open file
//      File file = new File("input.txt");
//      Scanner scan = new Scanner(file);
        Scanner scan = new Scanner(new File("input.txt"));
        // 2. initialize sum and count to zero
        double sum = 0;
        int count = 0;
        // 3. keep reading and compute accumulated sum
        while (scan.hasNextDouble()) {
            sum += scan.nextDouble();
            count++;
        }
        // 4. compute and display average
        if (count > 0) {
            double average = sum/count;
            System.out.println("Average is " + average);
        } else 
            System.out.println("No data.");
    }

}
