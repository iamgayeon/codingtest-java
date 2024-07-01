class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        for(int i = 0; i < k; i++){
            answer = numbers[index]; // 현재 인덱스의 값을 저장
            index = (index + 2) % numbers.length; // 인덱스를 2씩 증가시키고, 배열의 길이를 넘으면 0으로 초기화
        }
        return answer;
    }
}
