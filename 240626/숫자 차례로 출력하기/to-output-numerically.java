import java.util.Scanner;

public class Main {
    public static void printN(int n){
        if(n == 0)
            return;
        for(int i = 1; i <= n; i++)
            System.out.print(i + " ");
        System.out.println();
        printN(n - n);
        for(int i = n; i > 0; i--)
            System.out.print(i +" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printN(n);
    }
}