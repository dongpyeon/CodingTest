import java.util.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt = 0;
        for(int i=0; i<n; i++) //배열 채우는 for문
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); //배열 정렬

        for(int i=0; i<n; i++) //값 하나를 뽑아 두 수와 검사하는 for문
        {
            int st = 0;
            int ed = n-1;
            while(st<ed)
            {
                if(st==i)
                {
                    st++;
                    continue;
                }
                else if(ed==i)
                {
                    ed--;
                    continue;
                }

                if(arr[st] + arr[ed] < arr[i])
                {
                    st++;
                }
                else if(arr[st] + arr[ed] > arr[i])
                {
                    ed--;
                }
                else{
                    cnt++;
                    break;
                }
            }

        }
        System.out.println(cnt);
    }
}
