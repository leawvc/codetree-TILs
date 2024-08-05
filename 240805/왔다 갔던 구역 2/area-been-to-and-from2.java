import java.util.Scanner;

public class Main {
    public static int offset = 2000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [4001];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals('L'))
                offset -= a;
            else
                offset += a;
            for(int j = 0; j <= a; j++)
                arr[offset + j]++;
        }
        int cnt = 0;
        for(int i = 0; i < 4001; i++){
            if(2 <= arr[i])
                cnt++;
        }
        System.out.print(cnt);
    }
}