import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a < 10 || 20 < a)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}