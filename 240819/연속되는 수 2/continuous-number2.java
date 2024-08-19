import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[1000];
        int n = sc.nextInt();
        int max = 0, cnt = 0;
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i == 0 || arr[i - 1] == arr[i]){
                cnt++;
                // System.out.print("cnt : " + cnt);
                // System.out.println(" i : " + i);
            }
            else if(cnt > max){
                max = cnt + 1;
                cnt = 0;
            }
        }
        System.out.print(max);
    }
}