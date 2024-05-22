import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        String c;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.next();
            System.out.println(a * b);
            if(c.equals("C"))
                break;
        }
    }
}