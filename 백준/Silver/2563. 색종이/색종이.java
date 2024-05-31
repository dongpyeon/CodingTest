import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean white[][] = new boolean[101][101];
        int cnt = 0;
        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j=x; j<x+10; j++)
            {
                for(int k=y; k<y+10; k++)
                {
                    if(!white[j][k])
                    {
                        white[j][k] = true;
                        cnt++;
                    }
                    
                }
            } 
        }
        System.out.println(cnt);
    }
}