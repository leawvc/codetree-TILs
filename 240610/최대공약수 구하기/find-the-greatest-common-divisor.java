import java.util.Scanner;

public class Main {
    public static void printNumber(int n, int m){
        int max_sql = 1;
        for(int i = 1; i < n; i++){
            if(n % i == 0 && m % i == 0)
                max_sql = i;
        }
        System.out.print(max_sql);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        printNumber(n, m);
    }
}