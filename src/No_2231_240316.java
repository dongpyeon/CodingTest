import java.io.*;

/* 분해합 */
public class No_2231_240316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int min = 1000000;
        for (int i = 1; i < N; i++) {
            int tmp = i;
            int sum = 0; // 각 자릿수의 합

            while (tmp > 0) {
                sum += tmp % 10; // 숫자의 일의 자리를 구해서 합에 더함
                tmp = tmp / 10; // 다음 자릿수를 계산하기 위해 숫자를 10으로 나눔
            }

            if (N == i + sum && min > i) {
                min = i;
            }
        }

        if (min == 1000000) {
            min = 0; // 생성자가 없는 셀프 넘버임
        }
        bw.write(min + "\n");
        bw.flush();
    }
}

