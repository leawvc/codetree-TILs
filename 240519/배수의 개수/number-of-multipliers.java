import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;
        int cnt_A  = 0;
        for (int i = 1; i <= 10; i++) {
            n = sc.nextInt();
            if(n % 3 == 0)
                cnt++;
            if(n % 5 == 0)
                cnt_A++;
        }
        System.out.print(cnt +" " + cnt_A);
    }
}