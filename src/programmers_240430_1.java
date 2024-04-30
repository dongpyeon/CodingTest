class programmers_240430_1 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int maxmax=0;
        int minmin=0;
        int h=m;

        //최소공배수
        while(h<=n*m)
        {
            if(h%n==0 && h%m==0)
            {
                maxmax=h;
                break;
            }

            else
                h+=1;
        }
        //최대공약수

        for(int i=n; i>=1; i--)
        {
            if(m%i==0)
            {
                minmin=i;
                break;
            }
        }

        answer[0]=minmin;
        answer[1]=maxmax;
        return answer;
    }
    //최소공배수는 큰 값을 차례로 배수해주는데 그게 작은수로 나눠 떨어지면 ㄱㄱ
    //최대 공약수는 작은수의 약수를 구하고 그게 최대에 적용되면 ㄱㄱ



    //코딩테스트 연습 > 연습문제 > 최대공약수와 최소공배수
}