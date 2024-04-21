import java.util.*;
class programmers_240421 {
    public int[] solution(String s) {
        //포문 s 개수만큼 돌리는데
        // s 하나 뽑아서 앞에를 탐색해 하나가 만날때까지 ++ 해주고 (근데이게 맨첨이면 -1해야되거든)
        // 만나면 answer에 카운트 넣어
        // 맨 처음까지 가도 탐색 안되면 -1 을 넣어

        int[] answer = new int[s.length()];
        ArrayList<Integer> answerarr = new ArrayList<>();
        String [] word = s.split("");

        for(int i=0; i<s.length(); i++)
        {
            int idx=1;
            while(idx!=0)
            {
                if(i==0 || i-idx<0)
                {
                    answerarr.add(-1);
                    break;
                }
                if(word[i-idx].equals(word[i]))//현재문자와 -idx 한게 같으면
                {
                    answerarr.add(idx);
                    break;
                }
                idx++;
            }
        }

        //arrayList를 답으로 옮기기
        for(int j=0; j<s.length(); j++)
            answer[j]=answerarr.get(j);
        return answer;

    }
    //코딩테스트 연습 > 연습문제 > 가장 가까운 같은 글자
}