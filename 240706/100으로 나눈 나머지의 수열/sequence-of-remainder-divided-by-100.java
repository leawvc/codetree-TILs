import java.util.Scanner;

public class Main {
    public static int fact(int n){
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;
        return (fact(n - 1) * fact(n - 2) % 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fact(n));
    }
}