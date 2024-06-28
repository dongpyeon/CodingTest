import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int take = nums.length/2;
        
        if(set.size() > take)
            return take;
        
        return set.size();
    }
}