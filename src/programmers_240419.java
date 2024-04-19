class programmers_240419 {
    public String solution(int[] food) {
        //홀수인거 짝수로 바꾸고 %2=0이 아니면 -1
        //food[1] /2 = 수만큼 1
        //food[2] /2 = t수만큼 2
        //food[3] /2 = 수만큼 3을 쓰고
        //0 넣고 꺼꾸로 뒤집은거 넣고

        String answer = "";
        for(int i=1; i<food.length; i++)
        {
            if(food[i]%2 != 0)
                food[i]-=1;
        }

        for(int j=1; j<4; j++)
        {
            for(int k=0; k<food[j]/2; k++)
            {
                String s = Integer.toString(j);
                answer += s;
            }
        }

        String reverse = "";

        for (int z=answer.length()-1; z>=0; z--)
        {
            reverse+=answer.charAt(z);
        }

        answer += "0"+reverse;

        return answer;
    }
    //코딩테스트 연습 > 연습문제 > 푸드 파이트 대회
}