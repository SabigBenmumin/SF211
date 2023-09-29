import java.util.Random;

public class Q6 {
    public static void main(String[] args){
        Random rand = new Random();
        int min = rand.nextInt(41) + 60;
        for(int i = 0; i < 4; i++) {
            int next = rand.nextInt(41) + 60;
            min = Math.min(min ,next);
        }
        System.out.print("Min = " + min);
    }
}
