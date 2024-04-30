class programmers_240430 {
    public int solution(int n) {
        int answer = 0;
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else

            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                    answer+=i;
            }
        return answer+n+1;
    }



    //코딩테스트 연습 > 연습문제 > 약수의 합
}