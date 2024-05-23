import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String arr1[] = new String[s.length()];
        String arr2[] = new String[s.length()];
        arr1=s.split("");
        Arrays.sort(arr1);
        
        for(int i=arr1.length-1, j=0; i>=0; i--,j++)
        {
            arr2[j]=arr1[i];
        }
        
        for(String z : arr2)
        {
            answer+=z;
        }
        
        return answer;
    }
}