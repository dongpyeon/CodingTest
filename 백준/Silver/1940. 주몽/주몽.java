import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int cnt = 0;
        
        int arr[] = new int[n];
        
        for(int i = 0; i<n; i++) //배열에 값 넣기
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); //정렬해주고
        
        int st = 0;
        int ed = n-1;
        
        while(st<ed)
        {
            if(arr[st]+arr[ed] < target)
                st++;
            else if(arr[st]+arr[ed] > target)
                ed--;
            else{
                cnt++;
                st++;
            }
        }
        System.out.println(cnt);
        
    }
}