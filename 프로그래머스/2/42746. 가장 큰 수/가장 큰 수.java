import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = new String(); 
        String[] arr = new String[numbers.length]; // 정수 배열을 문자열 배열로 변환할 배열 선언

        // 정수 배열을 문자열 배열로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]); // 각 정수를 문자열로 변환하여 배열에 저장
        }

        // 문자열 배열을 정렬 (o2+o1과 o1+o2를 비교하여 내림차순 정렬)
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 정렬 후 첫 번째 원소가 "0"이면 모든 원소가 0으로 이루어진 경우이므로 "0"을 반환
        if (arr[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열 배열을 순회하며 결과 문자열에 추가
        for (String num : arr) {
            answer+=(num);
        }

        // 결과 문자열을 String 형태로 반환
        return answer;
    }
}