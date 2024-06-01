import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0; i<n; i++)
        {
            arr[i][1] = sc.nextInt(); //y좌표가 증가하는 순이니 x를 뒤에 y를 앞에 둬서 y를우선 비교함
            arr[i][0] = sc.nextInt();
        }
        
        Arrays.sort(arr, (f,b) -> {
            if(f[0]==b[0]) //y좌표가 같을때는 x좌표를 비교
                return f[1]-b[1];
            else
                return f[0]-b[0]; //아닌경우 그냥 y좌표만 비교
        });
        
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i][1]+" "+arr[i][0]);
        }
    }
}