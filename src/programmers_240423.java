class programmers_240423 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int z=0; z<numbers.length; z++)
        {
            answer[z]=-1;
        }
        //전부 -1로 바꿔놓음 (그럼 큰걸 발견못하는거랑 마지막은 -1이 됨 편하죠)


        for(int i=0; i<numbers.length; i++) //number하나를 뽑음 numbers[i]
        {
            for(int j=i+1; j<numbers.length; j++) //numbers의 다음것들을 쭉 비교
            {
                if(numbers[i]<numbers[j])
                {
                    answer[i] = numbers[j];
                    break;
                }
            }
        }
        //numbers 만큼 for문을 열고,
        //[i+1], [i+2]...를 비교해서 크면 그 값을 result에 삽입 발견못하면 -1 삽입
        return answer;
    }//근데 이거 시간초과 코드,,,
    // 이 방법은 숫자들을 한 번씩 비교하므로 시간 복잡도가 O(N^2)이 됩니다.
    // 이 방법은 상대적으로 작은 입력에는 잘 동작하지만, 대규모의 입력에는 효율적이지 않습니다.

    //스택을 사용하여 시간을 줄일 수 있는데요, 스택은 뒷 큰수를 찾기 위해 효율적인 자료 구조입니다.
    // 스택을 활용하여 각 숫자의 뒷 큰수를 찾으면 시간 복잡도를 O(N)으로 줄일 수 있습니다.
    //라네요,, 쓰읍..


    //코딩테스트 연습 > 연습문제 > 뒤에 있는 큰 수 찾기
}