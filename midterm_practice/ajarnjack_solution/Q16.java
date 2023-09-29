import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        // 1. read a word
        Scanner scan = new Scanner(System.in);
        String word;
        // 2. check whether it is a binary number
        boolean isBinary;
        do {
            System.out.print("Enter a word: ");
            word = scan.next();
            isBinary = true;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != '0' && word.charAt(i) != '1')
                    isBinary = false;
            }
        } while (!isBinary);

        // 3. count the number of 1's
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '1')
                count++;
        }
        System.out.println("There are " + count + " 1's.");

    }

}
