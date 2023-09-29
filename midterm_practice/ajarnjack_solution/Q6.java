import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        // 1. generate and compute minimum of 5 random ints between 60 and 100
        Random rand = new Random();
        int minNum = rand.nextInt(41) + 60; // assume first num is minimum
        for (int i = 0; i < 4; i++) {
            int num = rand.nextInt(41) + 60;
            if (num < minNum)  // if next num is smaller, change minimum
                minNum = num;
//          System.out.println(num + ", " + minNum);
        }
        // 2. display result
        System.out.println("Minimum number is " + minNum);
    }

}
