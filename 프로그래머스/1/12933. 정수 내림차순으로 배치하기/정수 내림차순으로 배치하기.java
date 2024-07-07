import java.util.*;
class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String a = "";
        String arr[] = s.split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--)
        {
            a+=arr[i];
            System.out.print(arr[i]);
        }
        long answer = Long.parseLong(a);
        return answer;
    }
}