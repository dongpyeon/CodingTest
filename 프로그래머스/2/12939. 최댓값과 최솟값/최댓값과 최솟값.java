import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr2 =s.split(" ");
        int arr[] = new int[arr2.length];
        int i=0;
        for(String n : arr2)
        {
            int m = Integer.parseInt(n);
            arr[i] = m;
            i++;
        }
        
        Arrays.sort(arr);
        answer += String.valueOf(arr[0]);
        answer += " ";
        answer += String.valueOf(arr[arr.length-1]);
        
        
        return answer;
    }
}