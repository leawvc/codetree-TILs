import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        int[] arr = new int[n];

        int MAXVal = INT_MAX;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (MAXVal > arr[i]) {
                MAXVal = arr[i];
            }
        }
        for (int i : arr){
            if(i == MAXVal)
                cnt++;
        }

        System.out.println(MAXVal+ " "+ cnt);
    }
}