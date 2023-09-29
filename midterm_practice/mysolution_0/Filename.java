//this is Q3
import java.util.Scanner;

public class Filename {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = scan.next();
        int dotpos = filename.indexOf(".");
        String extension = filename.substring(dotpos+1, filename.length());
        System.out.print("file type is " + extension);
    }
}
