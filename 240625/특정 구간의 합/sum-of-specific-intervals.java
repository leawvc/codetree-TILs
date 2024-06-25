import java.util.Scanner;

public class Main {
    public static void back(int [] arr, int a1, int a2){
        int result = 0;
        for(int i = a1 - 1; i < a2; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            back(arr, a1, a2);
        }
    }
}