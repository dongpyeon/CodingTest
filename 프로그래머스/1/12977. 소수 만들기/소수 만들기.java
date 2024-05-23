class Solution {
    public int solution(int[] nums) {
        int i=0, j=1, k=2;

        
        int answer = 0;
            for(i=0; i<nums.length-2; i++)
            {
                for(j=i+1; j<nums.length-1; j++)
                {
                    for(k=j+1; k<nums.length; k++)
                    {
                        if(isPrime(nums[i]+nums[j]+nums[k]))
                        {
                            answer++;
                        }
                    }
                }
            }

        return answer;
    }
    public boolean isPrime(int n)
    {
        for(int z=2; z<n/2; z++)
        {
            if(n%z==0)
            {
                return false;
            }
                
        }
        return true;
    }
    //처음엔 0,1,2 로 해ijk
    // k++로 쭉 가다가 nums크기만큼 되면 j를 1올리고 다시 j+1로 설정
    // j도 증가시키면서 쭉 다다르다가 nums크기 -1에 도달하면 i증가하고 i+1로 설정
    // i가 nums 크기 -2에 도달하면 종료
    //
}