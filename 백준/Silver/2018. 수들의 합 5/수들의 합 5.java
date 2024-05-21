import java.util.*;
import java.lang.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int cnt = 0;
        for(int i =1; i<=n; i++)
        {
            sum = 0;
            for(int j=i; j<=n; j++)
            {
                sum+=j;
                if(sum==n)
                {
                    cnt++;
                    break;
                }
                else if(sum>n)
                {
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}
