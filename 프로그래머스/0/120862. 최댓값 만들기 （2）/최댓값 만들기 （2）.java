import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        // [1, 2, -3, 4, -5]
        // [-5, -3, 1, 2, 4]
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] *numbers[numbers.length-2];
        if(num1 < num2){
            answer = num2;
        }else{
            answer = num1;
        }
        return answer;
    }
}