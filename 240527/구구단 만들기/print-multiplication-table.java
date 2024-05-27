import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int j = 1; j <= 9; j++) {
            for (int i = m; i >= n; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " * " + j + " = " + (i * j));
                if (i % 2 == 0 && i > n) 
                    System.out.print(" / ");
            }
            System.out.println();
        }
    }
}