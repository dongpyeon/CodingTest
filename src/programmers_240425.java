class programmers_240425 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i<=right; i++)
        {
            int count =0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;

        //count는 0으로 설정
        //left 부터 rifght 포함 까지 포문
        //포문내용 : 포문 1부터 left 까지 left나누기 %j가 0인 것 count +=1
        //1차 포문 끝자락에
    }


    //코딩테스트 연습 > 연습문제 > 약수의 개수와 덧셈
}