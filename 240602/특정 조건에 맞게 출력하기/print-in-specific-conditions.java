import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[100];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i ++){
            if(arr[i] == 0)
                break;
            if(arr[i] % 2 != 0)
                System.out.print(arr[i] + 3 + " ");
            else
                System.out.print(arr[i] / 2 + " ");
        }
    }
}