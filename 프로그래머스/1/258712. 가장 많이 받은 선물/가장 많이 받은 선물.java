import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int max = 0;
        int arr[][] = new int[friends.length][friends.length]; //주고받은 선물리스트 배열 틀(크기 작성)
        int arr2[] = new int[friends.length];
        
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i =0; i<friends.length; i++) //해쉬맵에 "이름" : "인덱스번호" 로 저장
        {
            hash.put(friends[i],i);
        }
        
        for(int i = 0; i<gifts.length; i++) //주고받은 선물리스트 배열 완성.
        {
            String s = gifts[i];
            String[] list = s.split(" ");
            int givetoidx = hash.get(list[0]);
            int givemeidx = hash.get(list[1]);
            
            arr[givetoidx][givemeidx] += 1;
        }
        
        for(int i = 0; i<friends.length; i++) // 선물지수 
        {
            int cnt = 0;
            for(int j = 0; j<friends.length; j++)
            {
                cnt += arr[i][j];
                cnt -= arr[j][i];  
            }
            arr2[i] = cnt;
        }
        
        for(int i =0; i<friends.length; i++)
        {
            int cnt = 0;
            for(int j = 0; j<friends.length; j++) 
            {
                if(arr[i][j] > arr[j][i]) //내가 준게 더 클때 cnt++
                    cnt++;
                else if(arr[i][j] == arr[j][i])// 같으면 지수비교후 +1 or +0.
                {
                    cnt+= arr2[i]>arr2[j] ? 1 : 0;
                }
            }
            max = Math.max(max,cnt);
        }
        
        return max;
        //입출력 예 처럼 2차원 배열로 쪼개줌
        //해쉬맵으로 할건데 프렌드 이름이 키 밸류가 인덱스로 할 거
        // 
    }
}