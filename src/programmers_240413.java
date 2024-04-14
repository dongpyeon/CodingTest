import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class programmers_240413 {
    public int solution(int[][] sizes) {
        int big, small;
        int mostsmall =0;
        int mostbig =0;
        for(int i=0; i<sizes.length; i++)
        {
            big = sizes[i][0];
            small = sizes[i][1];

            if(big<small)
            {
                int temp = small;
                small=big;
                big=temp;
            }

            if(mostbig<big)
                mostbig=big;

            if(mostsmall<small)
                mostsmall=small;

        }
        int answer = mostbig*mostsmall;
        return answer;
    //코딩테스트 연습 > 완전탐색 > 최소직사각형
}
