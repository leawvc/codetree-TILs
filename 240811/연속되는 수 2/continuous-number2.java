import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 1;
        int value = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[i - 1]) {
                value++;
            } else {
                if(value > max) {
                    max = value;
                }
                value = 1;
            }
        }
        if(value > max) {
            max = value;
        }
        System.out.print(max);
    }
}