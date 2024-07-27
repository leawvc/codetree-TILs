import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        int power = 1;

        while (n > 0) {
            int remainder = n % b;
            result += remainder * power;
            n /= b;
            power *= 10;
        }

        System.out.println(result);
    }
}