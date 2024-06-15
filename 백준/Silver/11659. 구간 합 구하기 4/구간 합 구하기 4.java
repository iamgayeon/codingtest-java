import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr1 = new int[n+1];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            arr1[i+1] = arr1[i] + arr[i];
        }



        for(int j=0;j<m;j++){
            int sum = 0;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            sum = arr1[n2]  - arr1[n1-1];
            System.out.println(sum);
        }


    }
}
