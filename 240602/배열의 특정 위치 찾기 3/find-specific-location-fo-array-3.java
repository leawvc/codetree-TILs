import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            cnt++;
        }

        System.out.println(arr[cnt - 1] + arr[cnt - 2] + arr[cnt - 3]);
    }
}