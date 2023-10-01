import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        // 1. random two integers between 0 and 100
        Random rand = new Random();
        int num1 = rand.nextInt(101);
        int num2 = rand.nextInt(101);
        // 2. find minimum of the two
        int minLength = Math.min(num1, num2);
        // 3. display result
        System.out.println("Minimum length is " + minLength);
    }

}
