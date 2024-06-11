import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            cnt += i;
        }
        return cnt / 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}