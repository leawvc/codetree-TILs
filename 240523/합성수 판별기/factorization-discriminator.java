import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean satisfied = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                satisfied = true;
                break;
            }
        }
        if (satisfied == true) {
            System.out.println("C");
        }
        else {
            System.out.println("N");
        }
    }
}