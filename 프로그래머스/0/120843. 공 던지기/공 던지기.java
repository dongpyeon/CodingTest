class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        int count =1;
        while(true)
        {
            if(count == k)
            {
               break;
            }
            count++;
            idx+=2;
            if(idx > numbers.length-1)
            {
                idx -= numbers.length;
            }

        }
        return numbers[idx];
    }
}