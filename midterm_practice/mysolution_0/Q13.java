import java.io.IOException;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(new File("input.txt"));
        double sum = 0;
        int count = 0;
        while (scan.hasNextDouble()){
            sum += scan.nextDouble();
            count++;
        }
        System.out.println("Average = " + sum/count);
    }
}
