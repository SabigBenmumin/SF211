import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        String world1, world2;
        int len1, len2, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first world: ");
        world1 = scan.nextLine();
        System.out.print("Enter second world: ");
        world2 = scan.nextLine();
        len1 = world1.length();
        len2 = world2.length();
        result = Math.min(len1, len2);
        System.out.println(result);

    }
}
