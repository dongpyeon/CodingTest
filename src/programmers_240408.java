import java.util.Arrays;

class programmers_240408 {
    public String solution(int[] numbers) {
        String answer = "";
        String arr[] = new String[numbers.length];

        for(int i=0; i<numbers.length; i++)
        {
            arr[i]=Integer.toString(numbers[i]);
        }

        Arrays.sort(arr);

        for(int j=arr.length-1; j>=0; j--)
            answer+=arr[j];


        return answer;
        //2, 29999, 20, 209, 2001
        // 맨앞자리 큰거부터 주욱
        // 앞자리가 같은데 개수가 다르면 그 것들 비교
    }
        //코딩테스트 연습 > 정렬 > 가장 큰 수
}
