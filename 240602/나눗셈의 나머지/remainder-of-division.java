import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int [] arr = new int[10];
        while(a > 1){
            arr[a % b]++;
            a /= b;
        }
        for(int i = 0; i <= 9; i++){
            sum += arr[i] * arr[i];
        }
        System.out.print(sum);
    }
}