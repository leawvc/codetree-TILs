import java.util.Scanner;

public class Main {
    public static int n, m, k;
    public static int sum(int j){
        if(j < 10)
            return j;
        return sum(j / 10) + (j % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        System.out.print(sum(n * m * k));
    }
}