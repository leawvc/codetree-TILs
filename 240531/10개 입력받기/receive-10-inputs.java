import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            arr[i] = n;
        }

        int sum = 0, cnt = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] == 0)
                break;
            cnt++;
            sum+=arr[i];
        }
        System.out.printf("%d %.1f",sum, (double)sum / cnt);
    }
}