import java.util.Scanner;

public class Main {
    public static int cli(int n){
        if(n == 0)
            return 2;
        if(n == 1)
            return 4;
        return (cli(n - 2) * cli(n - 3)) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(cli(n));
    }
}