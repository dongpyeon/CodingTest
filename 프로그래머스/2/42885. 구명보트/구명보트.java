import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int startIdx=0;
        int endIdx=people.length -1;
        Arrays.sort(people);
        while (startIdx <= endIdx) {
            
            if (people[startIdx] + people[endIdx] <= limit) {   // 만약 제일 가벼운 사람과 무거운 사람을 함께 탈 수 있을 때
                startIdx++;                                     // 조건에 맞으면 가벼운 사람이 탔는 것이므로 startIdx에 + 1
            }
            
            endIdx--;                                           // 무거운 사람은 항상 보트를 탐
            
            answer++;											// 보트 사용 횟수 증가
        }
        return answer;
    }
}