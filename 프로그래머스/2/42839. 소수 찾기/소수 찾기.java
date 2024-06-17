import java.util.*;
class Solution {
    static HashSet<Integer> combiset = new HashSet<>();
    public void combi(String selected, String others){
        if(!selected.equals(""))
        {
            combiset.add(Integer.valueOf(selected));
        }
        
        
        for(int i=0; i<others.length(); i++)
        {
            combi(selected+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }
    }
    public boolean isPrime(int num){
        if(num ==0 || num ==1)
        {
            return false;
        }
        int lim = (int)Math.sqrt(num);
        
        for(int i=2; i<=lim; i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public int solution(String numbers) {
        combi("",numbers);
        int cnt = 0;
        for(int num : combiset)
        {
            if(isPrime(num))
            {
                cnt++;
            }
        }
        return cnt;
    }
}