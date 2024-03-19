import java.io.*;
import java.util.*;

public class No_2750_240319 {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];

       for(int i = 0; i<n; i++)
       {
           arr[i]=sc.nextInt();
       }

       Arrays.sort(arr);

       for(int val : arr){
           System.out.println(val);
       }




    }
}