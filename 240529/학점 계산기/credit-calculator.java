import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0, cnt = 0, avg = 0;
        for (int i = 0; i < n; i++) {
            double m = sc.nextDouble();
            sum += m;
            cnt++;
        }
        avg = sum / cnt;
        System.out.printf("%.1f\n", avg);
        if(avg >= 4)
            System.out.print("Perfect");
        if(avg < 3)
            System.out.print("Poor");
        else
            System.out.print("Good");
    }
}