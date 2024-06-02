import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] countArr = new int[7];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}