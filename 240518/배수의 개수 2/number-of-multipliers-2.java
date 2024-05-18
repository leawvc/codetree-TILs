import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;
        for (int i = 1; i <= 10; i++) {
            n = sc.nextInt();
            if(n % 2 != 0)
                cnt++;
        }
        System.out.print(cnt);
    }
}