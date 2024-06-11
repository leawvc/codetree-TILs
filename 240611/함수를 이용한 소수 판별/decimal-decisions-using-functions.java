import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;

        for(int i = n; i <= m; i++){
            if(isPrime(i))
                sum += i;
        }
        System.out.print(sum);
    }
}