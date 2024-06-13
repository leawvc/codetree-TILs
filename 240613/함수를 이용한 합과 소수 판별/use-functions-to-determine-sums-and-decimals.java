import java.util.Scanner;

public class Main {
    public static boolean onjeon(int a){
        if((a / 10 + a % 10) % 2 != 0 || a == 1)
            return false;
        int cnt = 0;
        for(int i = 2; i <= a; i++){
            if(a % i == 0)
                cnt++;
        }
        if(cnt != 1)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i = a; i <= b; i++){
            if(onjeon(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}