import java.util.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int n5= n/5;
       int n3= n/3;
       int result = 0;

       for(int i=n5; i>0; i--)
       {
           int temp = n-(5*i);
           if(temp%3==0){
               result = i+(temp/3);
               System.out.println(result);
               return;
           }
       }
        if(n%3!=0)
        {
            System.out.println(-1);
            return;
        }
        result = n3;
        System.out.println(result);
    }
}