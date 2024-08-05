import java.util.Scanner;

public class Main {
    public static int offset = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [201];

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j < b; j++)
                arr[offset + j]++;
        }
        int max = arr[0];
        for(int i = 1; i < 201; i++){
            if(max <= arr[i])
                max = arr[i];
        }
        System.out.print(max);
    }
}