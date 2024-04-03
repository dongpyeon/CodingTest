import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> ans = new ArrayList();
        int outCount = 0;
        int tryCount = 0;
        int j=0;
        while(outCount < progresses.length)
        {
            boolean check = true;
            if(progresses[j]<100)
            {
                for(int k=0; k<progresses.length; k++)
                {
                    progresses[k]+=speeds[k];
                }
            }
            else
            {
                while(check)
                {
                    tryCount++;
                    outCount++;
                    j++;
                    if (j >= progresses.length || progresses[j] < 100)
                        check = false;
                }
                ans.add(tryCount);
                tryCount=0;
            }
        }
        int[] answer = new int[ans.size()];

        for(int m = 0; m < answer.length;m++){
            answer[m] = ans.get(m);
        }

        return answer;

        //코딩테스트 연습 > 스택/큐 > 기능개발 (level2)
    }
}