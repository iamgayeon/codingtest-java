import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char arr[]  = n.toCharArray();

        for(int i=0; i<arr.length; i++){
            int max = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            if(arr[i] < arr[max]){
                char temp = arr[i];
                arr[i] = arr[max];
                arr[max]  = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }


    }
}
