import java.util.Scanner;

public class Main {
    public static void printN(int n){
        if(n == 0)
            return;
        printN(n - 1);
        for(int i = n; i > 0; i--)
            System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printN(n);
    }
}