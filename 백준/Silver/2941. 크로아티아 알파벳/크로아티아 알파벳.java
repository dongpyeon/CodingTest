import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 크로아티아 단어들
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < text.length(); ) {
            boolean found = false;
            for (String c : cro) {
                if (text.startsWith(c, i)) {
                    cnt++;
                    i += c.length();
                    found = true;
                    break;
                }
            }
            if (!found) {
                cnt++;
                i++;
            }
        }

        System.out.println(cnt);
    }
}
