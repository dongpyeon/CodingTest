import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<int[]> bridge = new LinkedList<>();
        Queue<Integer> truck = new LinkedList<>();
        for(int i =0; i<truck_weights.length; i++)
        {
            truck.add(truck_weights[i]);
        }
        
        int nowweight = 0;
        int time=0;
        while(!bridge.isEmpty() || !truck.isEmpty() ) //다리, 트럭 모두 비우면 끝.
        {
            
            if(!bridge.isEmpty() && bridge.peek()[0] <= time) //브릿지에서 트럭을 빼는 경우를 먼저 체크, 브릿지에 트럭이 있고 경과시간이 되거나 지난 트럭을 뺌.
            {
                int outtruck[] = bridge.poll();
                nowweight-= outtruck[1];
                
            }
            
            if(!truck.isEmpty() && bridge.size() < bridge_length && nowweight + truck.peek() <= weight)
            {
                int polltruck = truck.poll();
                nowweight+=polltruck;
                bridge.add(new int[] {time+bridge_length,polltruck});
            }
            
            
            time++;
            
        }
        
        return time;
    }
}