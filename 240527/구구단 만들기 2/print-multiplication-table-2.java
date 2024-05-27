import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int j = 1; j <= 4; j++) {
            for (int i = m; i >= n; i--) {
                System.out.print(i + " * " + j * 2+ " = " + (i * j * 2));
                if ( i > n) 
                    System.out.print(" / ");
            }
            System.out.println();
        }
    }
}