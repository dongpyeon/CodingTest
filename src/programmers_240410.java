import java.util.Arrays;

class programmers_240410 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max_val = citations[citations.length-1];
        for(int i=0; i<citations.length; i++)
        {
            int upCount =0;
            int downCount=0;
            int equalCount=0;

            for(int j=0; j<citations.length; j++)
                if(i>citations[j])
                    downCount++;
                else if(i<citations[j])
                    upCount++;
                else
                    equalCount++;

            if(i<=upCount && i>=downCount && answer<i)
                answer=i;
        }

        return answer;

        //앞에꺼 뽑아서 하나씩 비교하는데
        //내 이상인 거 개수 뽑아 내 이하인 것도 개수
        //그 개수가 나보다 이상이고 이하면 그걸 가져오고
        //그걸 h랑 비교해서 더 크면 h
    }
    //코딩테스트 연습 > 정렬 > H-index
}
