import java.util.*;
import java.lang.*;
import java.io.*;

// 메인 메서드는 "Main"이라는 클래스 안에 있어야 합니다.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();  // 배열의 길이 입력
        int trycount = sc.nextInt();  // 시도 횟수 입력
        int arr[] = new int[len];
        int sumsum = 0;
        int answer = 0;

        // 배열 요소 입력
        for(int i = 0; i < len; i++) { //누적합 방식 누적합을 배열에 넣음
            int temp = sc.nextInt();
            sumsum+=temp;
            arr[i] = sumsum;

        }

        // 시도 횟수만큼 반복
        for(int j = 0; j < trycount; j++) {
            int st = sc.nextInt();  // 시작 인덱스 입력
            int ed = sc.nextInt();  // 종료 인덱스 입력
            if(st==1)
            {
                answer= arr[ed-1];
            }
            else answer = arr[ed-1] - arr[st-2];

            // 결과 출력
            System.out.println(answer);
        }
    }
}
