import java.util.Arrays;

class programmers_240409 {
    public String solution(int[] numbers) {
        String answer = "";
        String arr[] = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0"))
            return "0";

        for (int j = 0; j < arr.length; j++) {
            answer += arr[j];
        }

        return answer;
        //코딩테스트 연습 > 정렬 > 가장 큰 수
    }
}
