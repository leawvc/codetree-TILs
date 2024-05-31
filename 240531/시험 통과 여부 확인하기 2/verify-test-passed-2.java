import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                int m = sc.nextInt();
                sum += m;
            }
            if(sum / 4 < 60)
                System.out.println("fail");
            else{
                System.out.println("pass");
                cnt++;
            }
            sum = 0;
        }
        System.out.println(cnt);
    }
}