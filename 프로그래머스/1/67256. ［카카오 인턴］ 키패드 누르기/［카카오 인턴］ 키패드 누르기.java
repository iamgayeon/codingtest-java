class Solution {
    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 12;
        String answer = "";
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += 'L';
                left = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += 'R';
                right = numbers[i];
            }else if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0){
                if(numbers[i] == 0){
                    numbers[i] = 11;
                }
                int leftdis =Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;

                int rightdis =Math.abs(numbers[i] - right) / 3 + Math.abs(numbers[i] - right) % 3;
                if(leftdis < rightdis){
                    answer += 'L';
                    left = numbers[i];
                } else if(rightdis == leftdis){
                    if(hand.equals("left")){
                        answer += 'L';
                        left = numbers[i];
                    }else{
                        answer += 'R';
                        right = numbers[i];
                    }
                }else{
                    answer += 'R';
                    right = numbers[i];
                }
        }
        
        }
        return answer;
    }
}