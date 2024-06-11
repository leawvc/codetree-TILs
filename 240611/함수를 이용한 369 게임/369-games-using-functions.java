import java.util.Scanner;

public class Main {
    public static boolean isMagicNumber(int n) {
        if(n % 3 == 0)
            return true;
        int temp = n; // temp 변수로 원본 n을 보존
        while(temp != 0) {
            if((temp % 10) % 3 == 0) {
                return true;
            }
            temp /= 10;
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