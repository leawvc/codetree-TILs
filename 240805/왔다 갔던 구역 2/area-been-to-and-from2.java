import java.util.Scanner;

public class Main {
    public static int offset = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [201];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals('L')){
                for(int j = a; j <= 0; j++)
                    arr[offset + i]++;
            }else{
                for(int j = 0; j <= a; j++)
                    arr[offset + i]++;
            }
        }
        int cnt = 0;
        for(int i = 0; i < 201; i++){
            if(2 <= arr[i])
                cnt++;
        }
        System.out.print(cnt);
    }
}