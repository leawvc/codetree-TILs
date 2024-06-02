import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int pp = sc.nextInt();
        int temp;

        System.out.print(p + " " + pp + " ");
        for (int i = 2; i < 10; i++) {
            temp = p + pp;
            p = pp;
            pp = temp;
            System.out.print(temp % 10 + " ");
        }
    }
}