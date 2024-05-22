import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, sum = 0, cnt = 0;

        a = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if(sum > a)
                break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt);
    }
}