import java.util.Random;

public class Q6 {
    public static void main(String[] args){
        Random rand = new Random();
        int minimum = rand.nextInt(41) + 60;
        int min;
        for(int i = 0; i < 4; i++ ){
            min = rand.nextInt(41) + 60;
            if(min > minimum){
                minimum = min;
            }
        }
        System.out.println(minimum);
    }
}
