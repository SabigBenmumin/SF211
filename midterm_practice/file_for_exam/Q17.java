import java.util.Scanner;

public class Q17 {

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
            // 3. check whether it has at least 3 consecutive 1's.
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '1')
                    count++;
                else if (word.charAt(i) == '0' && count < 3)
                    count = 0;
            }
            if (count >= 3)
                System.out.println("Accepted");
            else
                System.out.println("Rejected");
        }
    }

}
