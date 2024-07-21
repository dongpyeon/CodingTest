import java.util.*;
class Solution {
        // 시작하면 앞에 번호를 늘려
        // 앞에 번호는 인원수를 넘어서면 뒷번호 늘리고 앞번호는 다시 0부터 해야됨.
        // 체크단어는 뽑힌거 charAt0이고 이거랑 charAtlengh-1 을비교 틀리면 브레이크
        // 단어가 이전에 말한 게 있었을 경우
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String,Integer> hash = new HashMap<>();
        int people =1;
        int peopleIdx =1;
        char check = words[0].charAt(0);
        for(int i =0; i<words.length; i++,people++)
        {
            if(people>n)
            {
                people=1;
                peopleIdx++;
            }
            
            String temp = words[i];
            if(check==temp.charAt(0) && !hash.containsKey(temp)) //끝말을 제대로 이었고, 지금까지 말한 단어들에 포함이 안된다면.
            {
                check = temp.charAt(temp.length()-1); //끝말 저장.
                hash.put(temp,0); //사용된 단어 저장
            }
            else
            {
                answer[0]=people;
                answer[1]=peopleIdx;
                return answer;
            }
        }
        
        return answer;
    }
}