import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;
        int cnt = 1;
        while(n != 0){
            num += n % 10 * cnt;
            cnt *= 2;
            n /= 10;
        }
        System.out.print(num);
    }
}