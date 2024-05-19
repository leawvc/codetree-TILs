import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, sum = 0, cnt = 0;

        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            m = sc.nextInt();
            sum += m;
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double)sum / cnt);
    }
}