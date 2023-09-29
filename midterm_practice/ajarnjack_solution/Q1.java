import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. read two words
        System.out.print("Enter first word: "); // prompt
        String word1 = scan.next(); // read one word
        System.out.print("Enter second word: ");
        String word2 = scan.next();
        // 2. compare lengths and compute the minimum 
//      int minLength = word1.length();
//      if (word2.length() < minLength)
//          minLength = word2.length();
        int minLength = Math.min(word1.length(), word2.length());
        // 3. display result
        System.out.println("Minimum length is " + minLength);
    }

}
