import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, cnt = 0;
        m = sc.nextInt();
        for(int i = 0; i < m; i++){
            n = sc.nextInt();
            while(n != 1){
                if(n % 2 == 0){
                    n /= 2;
                }else{
                    n = n * 3 + 1;
                }
                cnt++;
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}