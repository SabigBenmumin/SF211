import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        // 1. read filename
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = scan.next();
        // 2. extract extension
        int dotPosition = filename.indexOf('.');
        String extension = filename.substring(dotPosition);
        // 3. display result
        System.out.println("File extension is " + extension);
    }

}
