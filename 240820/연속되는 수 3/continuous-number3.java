import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int [1000];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = 0, cnt = 1;
        for(int i = 1; i < n; i++){
            if(arr[i - 1] * arr[i] > 0)
                cnt++;
            else {
                if (cnt > max) {
                    max = cnt;
                }
                cnt = 1;
            }
        }
        if(cnt > max)
            max = cnt;
        System.out.print(max);
    }
}