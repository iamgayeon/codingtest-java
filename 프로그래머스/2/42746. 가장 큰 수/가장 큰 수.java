import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for(int num : numbers){
            list.add("" + num);
        }
        list.sort((o1, o2)->{
            return (o2 + o1).compareTo(o1 + o2);
        });
//        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        for(String str : list){
            if(str.equals("0") && sb.length() == 0){
                continue;
            }
            sb.append(str);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}