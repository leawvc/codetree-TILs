import java.util.Scanner;

public class Main {
    public static boolean onjeon(int[] arr, int[] arr1) {
        int arrLength = arr.length;
        int arr1Length = arr1.length;
        
        // Loop through the main array to find the start of the subarray
        for (int i = 0; i <= arrLength - arr1Length; i++) {
            // Check if the subarray matches
            boolean match = true;
            for (int j = 0; j < arr1Length; j++) {
                if (arr[i + j] != arr1[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[a];
        int[] arr1 = new int[b];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            arr1[i] = sc.nextInt();
        }

        // Check if arr1 is a subarray of arr or vice versa
        if (a >= b) {
            if (onjeon(arr, arr1))
                System.out.print("Yes");
            else
                System.out.print("No");
        } else {
            if (onjeon(arr1, arr))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
}