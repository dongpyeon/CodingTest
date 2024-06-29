import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++) //2개씩 더하기
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[set.size()];
        int idx =0;
        for(int i : set)
        {
            answer[idx++] = i;
        }
        Arrays.sort(answer); //오름차순
        return answer;
    }
}