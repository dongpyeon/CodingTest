import java.util.*;

class programmers_240406 {
    public int solution(int[] nums) {
        int n = nums.length/2;
        nums = Arrays.stream(nums).distinct().toArray(); // 중복제거
        if(nums.length>n)
            return n;
        else
            return nums.length;

        //코딩테스트 연습 > 해시 > 폰켓몬
    }
}