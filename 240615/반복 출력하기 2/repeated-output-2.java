import java.util.Scanner;

public class Main {
    public static void printWorld(int n){
        if(n == 0)
            return;

        printWorld(n - 1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printWorld(N);
    }
}