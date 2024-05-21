import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        int cnt = 0, sum = 0;

        for(int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if(20 > n || n > 29)
                break;
            sum += n;
            cnt++;
        }
        System.out.printf("%.2f", (double)sum / cnt);
    }
}