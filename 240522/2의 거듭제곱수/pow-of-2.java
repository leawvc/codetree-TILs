import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1, cnt = 0;
        
        n = sc.nextInt();

        while (true) {
            if(n == i)
                break;
            i *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}