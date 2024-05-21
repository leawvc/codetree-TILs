import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, cnt = 0;

        n = sc.nextInt();

        for(int i = 1; i <= 100; i++) {
            n /= i;
            cnt++;
            if(n <= 1) {
                break;
            }
        }
        System.out.println(cnt);
    }
}