class programmers_240428 {
    public int solution(int n) {
        int answer = 0;

        if (n<4)
            return 0;

        for(int i=4; i<=n; i++)
        {
            int count = 1;
            for(int j=1; j<=i/2; j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count>=3)
                answer+=1;
        }
        return answer;
    }
    //4이하는 무조건 0이고
    //4부터 n만큼 수들의 약수의 개수를 구함
    //첫번째 포문은 4부터 n 까지 i로
    //두번째 포문은 i%j가 0일때 즉 약수일때 카운트 ++
    //항상 나 자신은 포함됨으로 카운트 +1이 3이상일때
    //answer+=1


    //코딩테스트 연습 > 코딩테스트 입문 > 합성수 찾기
}