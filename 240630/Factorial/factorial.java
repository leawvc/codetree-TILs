import java.util.Scanner;

public class Main {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return fact(n -1) * n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(fact(n));
    }
}