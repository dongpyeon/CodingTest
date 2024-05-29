import java.util.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        String arr[] = new String[n];
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++)
        {
            set.add(sc.nextLine());
        }
        List<String> words = new ArrayList<>(set);
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                {
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length() - o2.length(); //반환값이 양수면 o1 음수면 o2반환
                }
            }
        });

        for(String word : words)
        {
            System.out.println(word);
        }
    }
}
