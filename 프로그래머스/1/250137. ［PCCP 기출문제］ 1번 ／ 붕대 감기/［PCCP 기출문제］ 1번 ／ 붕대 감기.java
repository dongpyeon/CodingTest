class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxhealth = health;
        int time = attacks[attacks.length-1][0];
        int attackCnt = 0;
        int healCnt = 0;
        for(int i=1; i<=time; i++) //마지막공격까지 시간이 초단위로 흐름
        {
            if(i==attacks[attackCnt][0]) //공격시간과 일치하면 공격받음 데미지입고, 연속성공 0 다음공격시간으로 설정
            {
                health-=attacks[attackCnt][1];
                healCnt = 0;
                attackCnt++;
                if(health<1)
                    return -1;
            }
            else //초당회복시간만큼 회복하고 연속성공 +1 
            {
                health+=bandage[1];
                healCnt++;
                if(healCnt==bandage[0]) //연속으로 회복할 경우
                {
                    health+=bandage[2];
                    healCnt=0;
                }
                if(health>maxhealth) //최대체력 초과할 경우 힐 x
                 health=maxhealth;
            }
            
        }
        return health;
    }
}
