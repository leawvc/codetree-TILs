import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(i % 2 != 0)
                sum += arr[i];
            if((i + 1) % 3 == 0)
                cnt += arr[i];
        }
        System.out.printf("%d %.1f", sum, cnt / 3);
    }
}