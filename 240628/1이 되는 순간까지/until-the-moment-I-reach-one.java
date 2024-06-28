import java.util.Scanner;

public class Main {
    public static int fact(int n, int cnt){
        if(n != 1){
            cnt++;
            if(n % 2 == 0)
                return fact(n / 2, cnt);
            else
                return fact(n / 3, cnt);
        }else{
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(fact(n, 0));
    }
}