import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter world: ");
        String file = scan.next();
        int position = file.indexOf(".");
        String name = file.substring(position+1);
        System.out.print("file extension is ");
        System.out.println(name);
    }
}
