import java.util.Scanner;

public class Main {
    public static int fact(int n, int cnt){
        if(n == 1)
            return cnt;
        else if(n == 0)
            return cnt - 1;
        else if(n % 2 == 1)
            return fact(n - 2, cnt) + n;
        else
            return fact(n - 2, cnt) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fact(n, 1));
    }
}