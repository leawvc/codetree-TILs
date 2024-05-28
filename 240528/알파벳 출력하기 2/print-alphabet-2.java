import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print((char)(65 + cnt) + " ");
                cnt++;
                if(cnt == 26)
                    cnt = 0;
            }
            System.out.println();
        }
    }
}