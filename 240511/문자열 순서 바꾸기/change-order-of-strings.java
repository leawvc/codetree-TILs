import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stinrg s = sc.next();
        Stinrg t = sc.next();
        String temp;
        temp = s;
        s = t;
        t = temp;
        System.out.println(t);
        System.out.println(s);
    }
}