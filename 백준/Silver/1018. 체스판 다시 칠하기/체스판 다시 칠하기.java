import java.util.*;

public class Main {
    public static boolean[][] arr;
    public static int min = 64; // 전역 변수로 이동

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        arr = new boolean[x][y];

        // 배열 입력 
        for (int i = 0; i < x; i++) {
            String str = sc.next();
            for (int j = 0; j < y; j++) {
                arr[i][j] = (str.charAt(j) == 'W'); // W일 때는 true, B일 때는 false
            }
        }

        // 8x8 서브 그리드를 검사
        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y - 8; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int cnt = 0;
        boolean TF = arr[x][y]; // 시작하는 색상

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != TF) cnt++;
                TF = !TF; // 다음 칸은 반대 색상
            }
            TF = !TF; // 다음 행의 첫 칸은 반대 색상
        }

        // 반대 색상으로 시작하는 경우 계산
        cnt = Math.min(cnt, 64 - cnt);

        if (cnt < min) min = cnt;
    }
}
