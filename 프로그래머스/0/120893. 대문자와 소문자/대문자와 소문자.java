class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        for(int i=0;i<my_string.length();i++){

            if(arr[i] >= 65 && arr[i] <=90){
                arr[i] = (char)(arr[i]+ 32);
            }
            else if(arr[i] >= 97 && arr[i] <=122){
                 arr[i] = (char)(arr[i]- 32);
            }
        }
        String s1 = new String(arr);
        return s1;
    }
}