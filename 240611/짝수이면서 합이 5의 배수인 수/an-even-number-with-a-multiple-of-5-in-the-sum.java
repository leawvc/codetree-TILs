import java.util.Scanner;

public class Main {
    public static boolean isMagicNumber(int n) {
        return n % 2 == 0 && (n % 10 + n / 10) % 5 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(isMagicNumber(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}