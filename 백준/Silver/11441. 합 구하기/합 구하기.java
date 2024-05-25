import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n+1];
        int answer = 0;
        for(int i=1; i<=n; i++)
        {
            int temp = sc.nextInt();
            sum+= temp;
            arr[i] = sum;
        }
        int repeat = sc.nextInt();
        
        for(int i =0; i<repeat; i++)
        {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            answer = arr[ed]-arr[st-1];
            System.out.println(answer);
        }
        
    }
}