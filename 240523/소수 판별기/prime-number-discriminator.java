import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean satisfied = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                satisfied = false;
            }
        }
        if (satisfied == true) {
            System.out.println("P");
        }
        else {
            System.out.println("C");
        }
    }
}