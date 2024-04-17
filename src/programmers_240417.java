import java.util.ArrayList;
import java.util.List;

class programmers_240417 {
    class Solution {
        public int solution(String t, String p) {
            int len = p.length();
            int go = 0;
            int answer = 0;
            long p_val = Long.parseLong(p);

            while(true)
            {
                if((go+len) > t.length())
                    break;

                long t_val=Long.parseLong(t.substring(go,go+len));
                if(t_val <= p_val)
                    answer++;
                go++;
            }

            return answer;
        }
    }
    //코딩테스트 연습 > 연습문제 > 크기가 작은 부분 문자열
}