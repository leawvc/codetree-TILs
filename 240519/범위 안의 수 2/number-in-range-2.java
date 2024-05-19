import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b, cnt = 0, sum = 0;

        for(int i = 0; i < 10; i++){
            b = sc.nextInt();
            if(0 <= b && b <= 200){
                sum += b;
                cnt++;
            }
        }
        System.out.printf("%d %.1f",sum, (double)sum / cnt);
    }
}