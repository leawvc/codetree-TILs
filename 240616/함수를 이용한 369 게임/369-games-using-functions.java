import java.util.Scanner;

public class Main {
    public static boolean isMagicNumber(int n) {
        while(n != 0){
            int digit = n % 10;
            if(digit == 3 || digit == 6 || digit == 9 || n % 3 == 0)
                return true;
            n /= 10;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        for(int i = n; i <= m; i++)
            if(isMagicNumber(i))
                cnt++;

        System.out.println(cnt);
    }
}