import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int max_sql = 1;
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0)
                max_sql = i;
        }
        if(max_sql != 1)
            System.out.print(n * m / max_sql);
        else
            System.out.print(n * m);
    }
}