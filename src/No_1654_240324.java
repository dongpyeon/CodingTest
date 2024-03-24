import java.util.Arrays;
import java.util.Scanner;

public class No_1654_240324 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int myLan = in.nextInt();
        int needsLan = in.nextInt();


        int myLanArray [] = new int[myLan];
        for(int i=0; i<myLan; i++)
        {
            myLanArray[i]=in.nextInt();
        }

        Arrays.sort(myLanArray);

        long right = myLanArray[myLan-1];
        long left = 1;
        long count, half;

        while(left<=right) {
            count = 0;
            half=(left+right)/2;

            for(int i=0;i<myLan;i++) count += myLanArray[i]/half;

            if(count<needsLan) right = half-1;
            else left = half+1;
        }

        System.out.println(right);








    }
}