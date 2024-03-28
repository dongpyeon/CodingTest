import java.util.Arrays;
import java.util.Scanner;

public class No_2675_240328 {
    // n개 받고
    // n번 for문으로 String으로 받고
    // 쪼개서 개수랑 스트링 저장
    // 후에 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for (int i=0; i<n; i++)
        {
            int count = sc.nextInt();
            String s = sc.next();

            for (int j =0; j<s.length(); j++)
            {
                for (int k=0; k<count; k++)
                {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print("\n");
        }


        }
    }
