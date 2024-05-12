import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        String s;

        s = result == 100 ? "pass" : "failure";
        System.out.print(s);
    }
}