import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        double sum = 0.0;
        int tmp = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;


        for(int i=0;i<n;i++){
           if(arr[i] > max){
              max = arr[i];
           }
        }


        for(int i=0;i<n;i++){
            sum +=arr[i];
        }


        sum = sum  * 100 / n / max;


        System.out.print(sum);

    }
}