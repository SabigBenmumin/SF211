//Sabig Benmumin 6510742197

import java.text.DecimalFormat;
import java.util.Random;

public class Q2 {
    public static void main(String[] args){
        Random rand = new Random();
        DecimalFormat form = new DecimalFormat("#.0%");
        int n;
        int count_H = 0;
        int count_T = 0;
        String temp = "";
        for(int i = 0; i < 30; i++){
            n = rand.nextInt(2);
            if(n == 0){
                temp += "H";
                count_H++;
            }else{
                temp += "T";
                count_T++;
            }
        }
        double H_percentage = (double) count_H/30;
        double T_percentage = (double) count_T/30;
        System.out.println(temp);
        System.out.print("Percent of heads = ");
        System.out.println(form.format(H_percentage));
        System.out.print("Percent of tails = ");
        System.out.println(form.format(T_percentage));
    }
}
