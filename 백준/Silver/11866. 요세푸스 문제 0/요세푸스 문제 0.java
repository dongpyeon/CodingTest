import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            que.add(i+1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append('<');
        while(que.size()>1)
        {
            for(int j=0; j<k-1; j++)
            {
                int temp = que.poll();
                que.offer(temp);
            }
            sb.append(que.poll());
            sb.append(", ");
         }
        sb.append(que.poll());
        sb.append(">");
        System.out.println(sb);
    }
}