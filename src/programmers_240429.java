class programmers_240429 {
    public int solution(int n) {
        int arr []= new int[101];
        arr[1]=1;
        for(int i=2; i<101; i++)
        {
            arr[i]=check(arr[i-1]);
        }

        int answer = arr[n];
        return answer;
    }

    public int check(int n){
        while(true)
        {
            String s = Integer.toString(n);
            if(n%3==0)
            {
                n++;
                continue;
            }

            else if(s.contains("3"))
            {
                n++;
                continue;
            }
            else
                break;
        }
        return n;
    }
    //101개 리스트만들고
    //1번째는 1 넣고
    //i==2 i<list.length i++
    //list[i] = list[i-1] +1 먼저 전에거 +1
    // list[i] 를 스트링하고 여기서 contain 3이 있으면 +1
    // list[i]%3=0 이면 +1



    //코딩테스트 연습 > 코딩테스트 입문 > 저주의 숫자 3
}