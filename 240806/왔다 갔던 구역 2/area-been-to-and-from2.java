import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[4001];
        int offset = 2000;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();

            if (b.equals("L")) {
                for (int j = 0; j < a; j++) {
                    offset--;
                    arr[offset]++;
                }
            } else {
                for (int j = 0; j < a; j++) {
                    arr[offset]++;
                    offset++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}