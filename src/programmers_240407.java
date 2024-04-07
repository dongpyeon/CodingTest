import java.util.*;
class programmers_240407 {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int m=0; m<commands.length; m++)
        {
            int i = commands[m][0];
            int j = commands[m][1];
            int k = commands[m][2];

            int temp [] = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(temp);
            answer[m]=temp[k-1];
        }

        return answer;
    }
        //코딩테스트 연습 > 정렬 > K번째수
}
