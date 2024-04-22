import java.util.ArrayList;

class programmers_240422 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int j=0;
        for(String[] arr : photo) //photo에서 사진을 하나 뽑고
        {
            int score = 0;
            for(int i =0; i<arr.length; i++) //사진의 나온 인물 개수만큼 for문
            {
                for(int z=0; z<name.length; z++) //나온 인물을 비교할 name 수만큼 for문
                {
                    if(arr[i].equals(name[z])) //name에서 하나씩 비교
                    {
                        score+=yearning[z];
                    }
                }
            }
            answer[j]=score;
            j++;
        }
        return answer;
        //photo만큼 포문
        //첫번째 배열 만큼 포문 i 써서
        // i가 name i랑 맞으면 yearning i 를 결과에플러스
        // 끝나면 리저트에 삽입
    }
    //코딩테스트 연습 > 연습문제 > 추억 점수
}