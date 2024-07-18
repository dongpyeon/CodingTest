import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(stack.isEmpty()) 
            {
                stack.push(c);
            }
            else if(stack.peek()==c) 
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0; 
    }
    //baabaa 면 인덱스0번째를 스택에 넣고 다음꺼를 비교함.
    //비교해서 같으면 스택에 있는걸 뺌.
    //같지 않으면 그냥 스택에 넣어줌
}
