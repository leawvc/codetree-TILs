import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                m++;
                System.out.print(m +" ");
            }
            System.out.println();
        }
    }
}