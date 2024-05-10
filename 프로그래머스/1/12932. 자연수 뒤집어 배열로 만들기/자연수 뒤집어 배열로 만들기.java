class Solution {
    public int[] solution(long n) {
        String w = Long.toString(n); //n을 스트링으로
        
        int iarr[] = new int[w.length()]; 
        String sarr[] = new String[w.length()];

        sarr = w.split(""); //스트링배열에 잘라서 넣음
        
        for(int i = sarr.length-1, j=0; i>=0; i--, j++) //스트링배열에 있는걸 거꾸로 인트배열에 넣음
        {
            iarr[j]=Integer.parseInt(sarr[i]);
        }
        int[] answer = {};
        return iarr;
    }
}