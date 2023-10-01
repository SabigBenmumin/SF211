import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testfile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("input.txt"));
        double sum = 0;
        int count = 0;
        while(scan.hasNextLine()){
            sum += scan.nextDouble();
            count++;
        }
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        double average = sum/count;
        System.out.println("average: " + average);
    }
}
