import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c = 0;
        a = (a/100)*100;
        
        while(a%b!=0)
        {
            a++;
            c++;
        }
        
        if(c<10)
        {
            System.out.println("0"+c);
        }
        else
            System.out.println(c);
        
    }
}