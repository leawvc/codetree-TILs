import java.util.Scanner;

public class Main {
    public static int getPastDays(int m, int d){
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int value = 0;
        
        for(int i = 0; i < m; i++)
            value += num_of_days[i];
        return value + d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.print(getPastDays(m2, d2) - getPastDays(m1, d1) + 1);
    }
}