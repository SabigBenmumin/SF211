import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        // 1. read one character
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);
        // 2. check if it a valid start character for identifiers
        boolean validChar = Character.isLetter(ch) || ch == '$' || ch == '_';
        if (validChar) 
            System.out.println(ch + " is a valid start character");
        else
            System.out.println(ch + " is not a valid start character");
    }

}
