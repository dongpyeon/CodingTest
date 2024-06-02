import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target  = sc.nextInt();
        int cnt = 1;
        int n = 666;
        
        while(cnt<target)
        {
            n++;
            if(String.valueOf(n).contains("666"))
            {
                cnt++;
            }
        }
        System.out.println(n);
    }
}