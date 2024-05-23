import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int count = 0;
        int idx=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : score)
        {
            if(count<k)
            {
                list.add(n);
                Collections.sort(list);
                count++;
            }
            else if(list.get(0)<n)
            {
                list.set(0,n);
                Collections.sort(list);
            }
            answer[idx]=list.get(0);
            idx++;
        }
        return answer;
    }
    // K 만큼 리스트에 값들 채워넣고 정렬해
    // 꽉찼으면, 새로들어올 수랑 리스트에서 제일 작은 수랑 비교
    // 새로들어올 수가 더 크면 작은수 위치에 넣고 정렬
    // 이 싸이클을 돌때마다 가장 answer에 입력
}