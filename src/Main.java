import java.util.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
        int n = sc.nextInt();
        int target[] = new int[n];
        int push = 1;
        for(int i=0; i<n; i++)
        {
            target[i] = sc.nextInt();
        }

        for(int tar : target)
        {
            if(stack.isEmpty() || stack.peek() < tar) //스택이 비었거나 뽑은게 tar보다 작으면 숫자 삽입
            {
                int minus = tar-push;
                if(minus<0)
                {
                    System.out.println("NO");
                    return;
                }

                for(int i=0; i<=minus; i++)
                {
                    stack.push(push);
                    sb.append('+').append('\n');
                    push++;
                }

            }
            else if(stack.peek()>=tar)
            {
                int minus = stack.peek()-tar;
                for(int i=0; i<=minus; i++)
                {
                    stack.pop();
                    sb.append('-').append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
