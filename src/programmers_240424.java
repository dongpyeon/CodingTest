class programmers_240424 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int firstcheck = 0;
        int lastcheck = 0;
        int hashtagidx = 50;
        int hashmaxidx = 0;
        //[1,2,3,4] 중 1번은 wallpaper의[i][j] i값중 #이 있는 가장 앞에있는것이고
        //             2번은 wallpaper의[i][j] j값중 #이 있는 가장 앞에 있는 j값이고
        //             3번은 wallpaper의 length 이고
        //             4번은 wallpaper의 j값중 #이 가장 마지막에있는 인덱스이다..!


        for(String s : wallpaper)
        {
            int lastidx = s.lastIndexOf('#');
            int idx = s.indexOf('#');

            if(lastidx==-1)
                continue;
            if(hashtagidx>idx)
                hashtagidx=idx;
            if(hashmaxidx<lastidx+1)
                hashmaxidx=lastidx+1;
        }

        for(String s : wallpaper)
        {
            if(s.contains("#"))
                break;
            firstcheck++;
        }

        for(int i=0; i<wallpaper.length; i++)
            if(wallpaper[i].contains("#"))
                lastcheck=i+1;

        answer[0]=firstcheck;
        answer[1]=hashtagidx;
        answer[2]=lastcheck;
        answer[3]=hashmaxidx;


        return answer;
    }


    //코딩테스트 연습 > 연습문제 > 바탕화면 정리
}