import java.util.Scanner;

public class Main {
    public static int getPastDays(int a, int b, int c){
        if(a == 11 && b <= 11 && c < 11)
            return -1;
        return (a * 1440 + b * 60 + c) - (11 * 1440 + 11 * 60 + 11);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(getPastDays(a, b, c));
    }
}