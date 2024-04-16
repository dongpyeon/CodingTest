import java.util.ArrayList;
import java.util.List;

class programmers_240416 {
    public int[] solution(int brown, int yellow) {

        int x=0;
        int y=0;
        int z=0;
        int all = brown+yellow;
        List<Integer> list = new ArrayList<>();

        //일단 약수여야되고
        //세로 즉 y 제곱이가 옐로보다 커야해
        //이렇게함해보자
        while(z!=all)
        {
            z++;
            if(0==(all%z))
                list.add(z);
        }
        int[] answer = [list.size()];
        for(int a : list)
            answer[i]=a;



        return answer;

    }
    //코딩테스트 연습 > 완전탐색 > 소수 찾기
}