//Sabig Benmumin 6510742197

import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String ori_world = scan.nextLine();
        String result = "";
        for(int i = 0; i < ori_world.length(); i++){
            if(i % 2 == 0){
                result += (ori_world.toUpperCase()).charAt(i);
            }else{
                result += (ori_world.toLowerCase()).charAt(i);
            }
        }
        System.out.println(result);
        
    }
}