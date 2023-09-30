import java.util.Random;

public class Q7 {
    public static void main(String[] args){
        Random rand = new Random();
        int total = 0;
        for(int i = 0; i<3; i++){
            total += rand.nextInt(51);
        }
        System.out.print("total: " + total);
    }
}
