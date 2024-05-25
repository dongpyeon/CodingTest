import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9]; 
        int sum = 0;
        int A=0;
        int B=0;
        boolean find = false;
        for(int i=0; i<9; i++)
        {
            int hight = sc.nextInt();
            arr[i] = hight;
            sum += hight;
        }
        Arrays.sort(arr); //정렬된 배열
        
        int target = sum-100; //두 합이 타겟값이 되는 두 값을 찾아야함
        
        for(int i=0; i<8; i++)
        {
            for(int j=i+1; j<9; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    A=arr[i];
                    B=arr[j];
                    find = true;
                    break;
                }
                else if(arr[i]+arr[j] > target)
                    break;
            }
            if(find)
                break;
        }
        
        for(int i=0; i<9; i++)
        {
            if(arr[i] == A || arr[i] == B)
                continue;
            
            System.out.println(arr[i]);
        }
        
        //난쟁이 7의 합이 100 임으로
        // 9명의 합 - 난쟁이 둘의 합이 100이 되어야 함
        //그 난쟁이 둘만 제외하고 출력하면 될듯
    }
}