import java.util.Arrays;
import java.util.Scanner;

public class No_1543_240323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String target_word = sc.nextLine();
        int count = 0;

        String new_word = word.replaceAll(target_word,"0");

        for (int i=0; i<new_word.length(); i++)
        {
            if(new_word.charAt(i) == "0")
                count++;
        }

        System.out.println(count);



    }
}