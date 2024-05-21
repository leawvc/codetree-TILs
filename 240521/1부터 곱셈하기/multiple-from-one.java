import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, prod = 1, cnt = 0;

        a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if(prod > a)
                break;
            prod *= i;
            cnt++;
        }
        System.out.println(cnt);
    }
}