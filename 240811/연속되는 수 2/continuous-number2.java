import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            if(i == 0 || arr[i] == arr[i - 1])
                max++;
            else
                break;
        }
        int value = 0;
        for(int i = 0; i < n; i++){
            if(i == 0 || arr[i] == arr[i - 1]){
                value++;
                // System.out.print(value);
            }
            else if(value > max){
                max = value;
                value = 0;
            }
        }
        System.out.print(max);
    }
}