import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] countArr = new int[10];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            countArr[arr[i] / 10]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}