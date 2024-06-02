import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int n = sc.nextInt();
        arr[0] = 1;
        arr[1] = n;
        System.out.print(1 + " " + n + " ");

        for(int i = 2; i < 100; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + " ");
            if(arr[i] > 100)
                break;
        }
    }
}