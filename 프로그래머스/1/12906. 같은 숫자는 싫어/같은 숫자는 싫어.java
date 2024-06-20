// 스택/큐 > 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906


// arr	            answer
// [1,1,3,3,0,1,1]	[1,3,0,1]
// [4,4,4,3,3]	    [4,3]

// 풀이 시뮬레이션
// 로직 : read와 prev를 비교, 만일 다르면? answer에 추가하는 전략
// #0 [1, 1, 3, 3, 0, 1, 1] index = 0, read = 0, prev = -1 answer = []
// #1 [1, 1, 3, 3, 0, 1, 1] index = 0, read = 1, prev = -1 answer = [1]
// #2 [1, 1, 3, 3, 0, 1, 1] index = 1, read = 1, prev = 1 answer = [1]
// #3 [1, 1, 3, 3, 0, 1, 1] index = 2, read = 3, prev = 1 answer = [1, 3]
// #4 [1, 1, 3, 3, 0, 1, 1] index = 3, read = 3, prev = 3 answer = [1, 3]
// #5 [1, 1, 3, 3, 0, 1, 1] index = 4, read = 0, prev = 3 answer = [1, 3, 0]
// #6 [1, 1, 3, 3, 0, 1, 1] index = 5, read = 1, prev = 0 answer = [1, 3, 0, 1]
// #7 [1, 1, 3, 3, 0, 1, 1] index = 6, read = 1, prev = 1 answer = [1, 3, 0, 1]

import java.util.*;

public class Solution {
    // 스택 없이 배열로만 풀이한 케이스
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int prev = -1; // 이전 값을 기억하는 변수, 초기값은 인자로 올 수 없는 음수로 초기화
        int count = 0; // answer의 크기를 결정하는 변수


        for(int i=0;i<arr.length;i++){
            if(arr[i] != prev){
                answer[count++] = arr[i]; // 답 추가
                prev = arr[i]; // 이전 값 업데이트
            }else{
                continue;
            }
        }


        return Arrays.copyOf(answer,count);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = new Solution().solution(arr);
        System.out.println(Arrays.toString(result));
    }
}

