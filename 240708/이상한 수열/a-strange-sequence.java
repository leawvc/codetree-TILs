import java.util.Scanner;

public class Main {
    public static int fact(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return fact(n / 3) + fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fact(n));
    }
}