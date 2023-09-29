import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        // 1. read a word
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        // 2. check whether it is a binary number
        boolean isBinary = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '0' && word.charAt(i) != '1')
                isBinary = false;
        }
        if (!isBinary) 
            System.out.println(word + " is not a binary number.");
        else {
            // 3. count the number of 1's
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '1')
                    count++;
            }
            System.out.println("There are " + count + " 1's.");
        }
    }

}
