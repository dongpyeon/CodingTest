import java.util.Arrays;
import java.util.Scanner;

public class No_2110_240324_notsolved {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int home = in.nextInt();
        int wifi = in.nextInt();

        int arr[] = new int[home];
        for (int i=0; i<home; i++)
        {
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);


    }
}