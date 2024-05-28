import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print((char)(65 + cnt));
                cnt++;
                if(cnt == 27)
                    cnt = 0;
            }
            System.out.println();
        }
    }
}