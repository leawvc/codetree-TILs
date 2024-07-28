import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int cnt = 1;
        while(n != 0){
            sum += n % 10 * cnt;
            n /= 10;
            cnt *= 2;
        }
        sum *= 17;
        int num = 0;
        cnt = 1;
        while(sum != 0){
            num += sum % 2 * cnt;
            sum /= 2;
            cnt *= 10;
        }
        System.out.print(num);
    }
}