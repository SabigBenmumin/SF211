import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        // read 10 values and compute min, max, average
        Scanner scan = new Scanner(System.in);
        double max=-1, min=101, sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a value: ");
            double val = scan.nextDouble();
            if (val >= 0 && val <= 100) {
                count++;
                sum += val;
                if (val > max)
                    max = val;
                if (val < min)
                    min = val;
            }
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Min = " + min + ", max = " 
            + max + ", average = " + average);
        } else 
            System.out.println("No valid data");
    }

}
